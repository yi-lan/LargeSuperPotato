package net.royling.largesuperpotato.item.create;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;
import net.royling.largesuperpotato.item.p1_0.custom.potatogearsword;

public class CreatePotatoItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> POTATOGEARSWORD =ITEMS.register("potato_gear_sword",
            potatogearsword::new);

    public static final RegistryObject<Item> POTATO_INGOT = ITEMS.register("potato_ingot",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_SHEET = ITEMS.register("potato_sheet",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_MECHANISM = ITEMS.register("potato_mechanism",
            ()->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
