package net.royling.largesuperpotato.item.potatodelight;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;
import net.royling.largesuperpotato.item.ModFood;

public class DelightItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> POTATO_PIECE =ITEMS.register("potato_piece",
            ()->new Item(new Item.Properties().food(ModFood.POTATO_PIECE)));
    public static final RegistryObject<Item> POTATO_CHIPS =ITEMS.register("potato_chips",
            ()->new Item(new Item.Properties().food(ModFood.POTATO_CHIPS)));
    public static final RegistryObject<Item> POTATO_KNIFE =ITEMS.register("potato_knife",
            PotatoKnife::new);
    public static final RegistryObject<Item> TOMATO_CHIPS =ITEMS.register("tomato_chips",
            ()->new Item(new Item.Properties().food(ModFood.TOMATO_CHIPS)));
    public static final RegistryObject<Item> POTATO_KETCHUP =ITEMS.register("potato_ketchup",
            ()->new Item(new Item.Properties().food(ModFood.POTATO_KETCHUP)));
    public static final RegistryObject<Item> MASHED_POTATO =ITEMS.register("mashed_potato",
            ()->new Item(new Item.Properties().food(ModFood.MASHED_POTATO)));
    public static final RegistryObject<Item> TOMATO_CHIPS_AND_POTATO_KETCHUP =ITEMS.register("tomato_chips_and_potato_ketchup",
            ()->new Item(new Item.Properties().food(ModFood.TOMATO_CHIPS_AND_POTATO_KETCHUP)));
    public static final RegistryObject<Item> PESTLE_AND_MORTAR =ITEMS.register("pestle_and_mortar",
            PestleAndMortar::new);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
