package net.royling.largesuperpotato.item.feitem;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.swing.plaf.PanelUI;

public class EnergyCapabilityProvider implements ICapabilityProvider, ICapabilitySerializable {
    private final LazyOptional<IEnergyStorage> energyStorage;
    private final CustomEnergyStorage energyStorageImpl;

    public EnergyCapabilityProvider(ItemStack stack,int capacity,int maxReceive,int maxExtract){
        this.energyStorageImpl = new CustomEnergyStorage(stack, capacity, maxReceive, maxExtract);
        this.energyStorage = LazyOptional.of(() -> energyStorageImpl);
    }
    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return cap == ForgeCapabilities.ENERGY ? energyStorage.cast() : LazyOptional.empty();
    }
    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("energy", energyStorageImpl.getEnergyStored());
        tag.putInt("capacity", energyStorageImpl.getMaxEnergyStored());
        return tag;
    }

    @Override
    public void deserializeNBT(Tag nbt) {
        if (nbt instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag) nbt;
            energyStorageImpl.energy = compoundTag.getInt("energy");
            energyStorageImpl.capacity = compoundTag.getInt("capacity");
        }
    }

    private static class CustomEnergyStorage implements IEnergyStorage{
        private final ItemStack stack;
        private int energy;
        private int capacity;
        private final int maxReceive;
        private final int maxExtract;

        public CustomEnergyStorage(ItemStack stack, int capacity, int maxReceive, int maxExtract) {
            this.stack = stack;
            this.capacity = capacity;
            this.maxReceive = maxReceive;
            this.maxExtract = maxExtract;
            this.energy = 0;
        }

        @Override
        public int receiveEnergy(int maxReceive, boolean simulate) {
            int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
            if (!simulate) {
                energy += energyReceived;
                saveEnergy();
            }
            return energyReceived;
        }

        @Override
        public int extractEnergy(int maxExtract, boolean simulate) {
            int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
            if (!simulate) {
                energy -= energyExtracted;
                saveEnergy();
            }
            return energyExtracted;
        }

        @Override
        public int getEnergyStored() {
            return energy;
        }

        @Override
        public int getMaxEnergyStored() {
            return capacity;
        }

        @Override
        public boolean canExtract() {
            return maxExtract > 0;
        }

        @Override
        public boolean canReceive() {
            return maxReceive > 0;
        }

        private void saveEnergy() {
            CompoundTag tag = stack.getOrCreateTag();
            tag.putInt("energy", energy);
            tag.putInt("capacity", capacity);
        }

    }

}
