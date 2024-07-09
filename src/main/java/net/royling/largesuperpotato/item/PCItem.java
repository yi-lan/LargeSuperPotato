package net.royling.largesuperpotato.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;

//原石工艺
public class PCItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> PRIOMGEN_POTATO = ITEMS.register("priomgen_potato",
            ()->new Item(new Item.Properties().food(ModFood.PRIOMGEN_POTATO)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
