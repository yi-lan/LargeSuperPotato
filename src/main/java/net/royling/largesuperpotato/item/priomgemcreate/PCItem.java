package net.royling.largesuperpotato.item.priomgemcreate;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;
import net.royling.largesuperpotato.item.ModFood;

//原石工艺
public class PCItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<Item> PRIOMGEM_POTATO = ITEMS.register("priomgem_potato",
            ()->new Item(new Item.Properties().food(ModFood.PRIOMGEN_POTATO)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
