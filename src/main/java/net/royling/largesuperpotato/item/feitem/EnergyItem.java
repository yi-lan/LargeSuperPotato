package net.royling.largesuperpotato.item.feitem;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

import static org.apache.commons.lang3.math.NumberUtils.min;

public class EnergyItem extends Item implements ICurioItem {

    private final int capacity;
    private final int maxReceive;
    private final int maxExtract;

    public EnergyItem(Item.Properties properties, int capacity, int maxReceive, int maxExtract) {
        super(properties.stacksTo(1).defaultDurability(0));
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pStack.getCapability(ForgeCapabilities.ENERGY).ifPresent(energy->{
            int energyStored = energy.getEnergyStored();
            int maxEnergyStored = energy.getMaxEnergyStored();

            double maxSpeed = min(maxReceive,maxExtract);


            String energyStoredStr = formatEnergy(energyStored);
            String maxEnergyStoredStr = formatEnergy(maxEnergyStored);
            Component energyStoredComponent = Component.literal(energyStoredStr)
                    .withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000))); // 蓝色
            Component maxEnergyStoredComponent = Component.literal(maxEnergyStoredStr)
                    .withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x800080))); // 紫色
            pTooltipComponents.add(Component.translatable("tooltip.largesuperpotato.energy",energyStoredComponent,maxEnergyStoredComponent));
            pTooltipComponents.add(Component.translatable("tooltip.largesuperpotato.energyspeed",String.format("%.2f",maxSpeed/1000)));
        });
    }
    private String formatEnergy(int energy) {
        if (energy < 1000000) {
            return String.format("%.2fK", energy / 1000.0);
        } else {
            return String.format("%.2fM", energy / 1000000.0);
        }
    }
    @Override
    public boolean isBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        return stack.getCapability(ForgeCapabilities.ENERGY).map(energy ->
                Math.round(13.0F * energy.getEnergyStored() / energy.getMaxEnergyStored())
        ).orElse(0);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return stack.getCapability(ForgeCapabilities.ENERGY).map(energy -> {
            float ratio = (float) energy.getEnergyStored() / energy.getMaxEnergyStored();
            int green = Math.round(255 * ratio); // 根据能量比例调整绿色亮度
            return (green << 8);
        }).orElse(0xFF00FF);
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
       return new EnergyCapabilityProvider(stack, capacity, maxReceive, maxExtract); // 默认容量设为1600000
    }
    @Override
    public void curioTick(SlotContext slotContext,ItemStack stack){
        var livingEntity = slotContext.entity();
        chargeItem(livingEntity.getMainHandItem(), stack);
        chargeItem(livingEntity.getItemBySlot(EquipmentSlot.HEAD), stack);
        chargeItem(livingEntity.getItemBySlot(EquipmentSlot.CHEST), stack);
        chargeItem(livingEntity.getItemBySlot(EquipmentSlot.LEGS), stack);
        chargeItem(livingEntity.getItemBySlot(EquipmentSlot.FEET), stack);
    }
    private void chargeItem(ItemStack tarStack,ItemStack batStack){
        if(!tarStack.isEmpty()){
            tarStack.getCapability(ForgeCapabilities.ENERGY).ifPresent(targetEnergy->{
                batStack.getCapability(ForgeCapabilities.ENERGY).ifPresent(batteryEnergy->{
                    int energyExtracted = batteryEnergy.extractEnergy(maxExtract,true);
                    int energyReceived=targetEnergy.receiveEnergy(energyExtracted,false);
                    batteryEnergy.extractEnergy(energyReceived,false);
                });
            });
        }
    }
}
