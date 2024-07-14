package net.royling.largesuperpotato.item.feitem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;

public class FEItem {
   public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

   public static final RegistryObject<Item> POTATO_ENERGY_STORAGE = ITEMS.register("potato_energy_storage",
           ()->new EnergyItem(new Item.Properties().stacksTo(1),1600000,1600,1600));
    public static final RegistryObject<Item> POTATO_ENERGY_STORAGE_EX = ITEMS.register("potato_energy_storage_ex",
            ()->new EnergyItem(new Item.Properties().stacksTo(1),12800000,16000,16000));
    public static final RegistryObject<Item> POTATO_ENERGY_STORAGE_SUPER = ITEMS.register("potato_energy_storage_super",
            ()->new EnergyItem(new Item.Properties().stacksTo(1),640000000,1600000,1600000));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
