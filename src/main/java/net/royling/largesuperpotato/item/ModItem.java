package net.royling.largesuperpotato.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;
import net.royling.largesuperpotato.item.ae2.PotatoStorageCell;
import net.royling.largesuperpotato.item.custom.EXPotato;
import net.royling.largesuperpotato.item.custom.EnderPotato;
import net.royling.largesuperpotato.item.custom.potatosword;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> PIGOTATO = ITEMS.register("pigotato",
            ()->new Item(new Item.Properties().food(ModFood.PIGOTATO)));
    public static final RegistryObject<Item> CREEPOTATO = ITEMS.register("creepotato",
            ()->new Item(new Item.Properties().food(ModFood.CREEPOTATO)));
    public static final RegistryObject<Item> EXPOTATO = ITEMS.register("expotato",
            ()->new EXPotato());
    public static final RegistryObject<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato",
            ()->new Item(new Item.Properties().food(ModFood.DIAMOND_POTATO)));
    public static final RegistryObject<Item> EMERALD_POTATO = ITEMS.register("emerald_potato",
            ()->new Item(new Item.Properties().food(ModFood.EMERALD_POTATO)));
    public static final RegistryObject<Item> ENDER_POTATO = ITEMS.register("ender_potato",
            ()->new EnderPotato());
    public static final RegistryObject<Item> GLASS_POTATO = ITEMS.register("glass_potato",
            ()->new Item(new Item.Properties().food(ModFood.GLASS_POTATO)));
    public static final RegistryObject<Item> CHROME_POTATO = ITEMS.register("chrome_potato",
            ()->new Item(new Item.Properties().food(ModFood.CHROME_POTATO)));
    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            ()->new Item(new Item.Properties().food(ModFood.GOLDEN_POTATO)));
    public static final RegistryObject<Item> LAVA_POTATO = ITEMS.register("lava_potato",
            ()->new Item(new Item.Properties().food(ModFood.LAVA_POTATO)));
    public static final RegistryObject<Item> NETHER_POTATO = ITEMS.register("nether_potato",
            ()->new Item(new Item.Properties().food(ModFood.NETHER_POTATO)));
    public static final RegistryObject<Item> NETHERITE_POTATO = ITEMS.register("netherite_potato",
            ()->new Item(new Item.Properties().food(ModFood.NETHERITE_POTATO)));
    public static final RegistryObject<Item> NETHERI_STAR_POTATO = ITEMS.register("nether_star_potato",
            ()->new Item(new Item.Properties().food(ModFood.NETHER_STAR_POTATO)));
    public static final RegistryObject<Item> OBSIDIAN_POTATO = ITEMS.register("obsidian_potato",
            ()->new Item(new Item.Properties().food(ModFood.OBSIDIAN_POTATO)));
    public static final RegistryObject<Item> COOKED_PIGOTATO = ITEMS.register("cooked_pigotato",
            ()->new Item(new Item.Properties().food(ModFood.COOKED_PIGOTATO)));
    public static final RegistryObject<Item> BONE_POTATO = ITEMS.register("bone_potato",
            ()->new Item(new Item.Properties().food(ModFood.BONE_POTATO)));
    public static final RegistryObject<Item> REDSTONE_POTATO = ITEMS.register("redstone_potato",
            ()->new Item(new Item.Properties().food(ModFood.REDSTONE_POTATO)));
    public static final RegistryObject<Item> SPIDER_POTATO = ITEMS.register("spider_potato",
            ()->new Item(new Item.Properties().food(ModFood.SPIDER_POTATO)));
    public static final RegistryObject<Item> STEAM_POTATO = ITEMS.register("steam_potato",
            ()->new Item(new Item.Properties().food(ModFood.STEAM_POTATO)));
    public static final RegistryObject<Item> APPOTATO = ITEMS.register("appotato",
            ()->new Item(new Item.Properties().food(ModFood.APPOTATO)));
    public static final RegistryObject<Item> CXK_POTATO = ITEMS.register("cxk_potato",
            ()->new Item(new Item.Properties().food(ModFood.CXK_POTATO)));
    public static final RegistryObject<Item> HEART_POTATO = ITEMS.register("heart_potato",
            ()->new Item(new Item.Properties().food(ModFood.HEART_POTATO)));
    public static final RegistryObject<Item> SLIME_POTATO = ITEMS.register("slime_potato",
            ()->new Item(new Item.Properties().food(ModFood.SLIME_POTATO)));
    public static final RegistryObject<Item> CHICKEN_POTATO = ITEMS.register("chicken_potato",
            ()->new Item(new Item.Properties().food(ModFood.CHICKEN_POTATO)));
    public static final RegistryObject<Item> BASKET_POTATO = ITEMS.register("basket_potato",
            ()->new Item(new Item.Properties().food(ModFood.BASKET_POTATO)));
    public static final RegistryObject<Item> POTATOSWORD =ITEMS.register("potatosword",
            ()->new potatosword());






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
