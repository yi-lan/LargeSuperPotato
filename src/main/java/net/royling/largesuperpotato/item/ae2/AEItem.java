package net.royling.largesuperpotato.item.ae2;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;

public class AEItem {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> POTATO_STORAGE_CELL =ITEMS.register("potato_storage_cell",
            ()->new PotatoStorageCell(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
