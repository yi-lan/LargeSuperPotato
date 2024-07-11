package net.royling.largesuperpotato.item.potatodelight;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;
import net.royling.largesuperpotato.item.ModItem;
import net.royling.largesuperpotato.item.ae2.AEItem;
import net.royling.largesuperpotato.item.create.CreatePotatoItem;
import net.royling.largesuperpotato.item.priomgemcreate.PCItem;

public class PotatoDelightTab {
    public static final DeferredRegister<CreativeModeTab> POTATO_DELIGHTS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LargeSuperPotato.MOD_ID);
    public static final RegistryObject<CreativeModeTab> POTATO_DELIGHT = POTATO_DELIGHTS.register("potato_delight",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(DelightItem.POTATO_KNIFE.get()))
                    .title(Component.translatable("creativetab.potato_delight"))
                    .displayItems((pParameters, pOutput) ->{
                        if(ModList.get().isLoaded("farmersdelight")) {
                            pOutput.accept(DelightItem.POTATO_CHIPS.get());
                            pOutput.accept(DelightItem.POTATO_PIECE.get());
                            pOutput.accept(DelightItem.POTATO_KNIFE.get());
                            pOutput.accept(DelightItem.MASHED_POTATO.get());
                            pOutput.accept(DelightItem.POTATO_KETCHUP.get());
                            pOutput.accept(DelightItem.TOMATO_CHIPS.get());
                            pOutput.accept(DelightItem.TOMATO_CHIPS_AND_POTATO_KETCHUP.get());
                            pOutput.accept(DelightItem.PESTLE_AND_MORTAR.get());
                        }
                    })
                    .build());
    public static void register(IEventBus eventBus){
        POTATO_DELIGHTS.register(eventBus);
    }
}
