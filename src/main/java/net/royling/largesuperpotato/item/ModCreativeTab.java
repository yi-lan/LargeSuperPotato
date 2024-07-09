package net.royling.largesuperpotato.item;

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

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> LARGESUPERPOTATOS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LARGESUPERPOTATO = LARGESUPERPOTATOS.register("largesuperpotato",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(ModItem.PIGOTATO.get()))
                    .title(Component.translatable("creativetab.largesuperpotato"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(Items.POTATO);
                        pOutput.accept(Items.BAKED_POTATO);
                        pOutput.accept(Items.POISONOUS_POTATO);
                        pOutput.accept(ModItem.PIGOTATO.get());
                        pOutput.accept(ModItem.CREEPOTATO.get());
                        pOutput.accept(ModItem.EXPOTATO.get());
                        pOutput.accept(ModItem.DIAMOND_POTATO.get());
                        pOutput.accept(ModItem.EMERALD_POTATO.get());
                        pOutput.accept(ModItem.ENDER_POTATO.get());
                        pOutput.accept(ModItem.GLASS_POTATO.get());
                        pOutput.accept(ModItem.CHROME_POTATO.get());
                        pOutput.accept(ModItem.GOLDEN_POTATO.get());
                        pOutput.accept(ModItem.LAVA_POTATO.get());
                        pOutput.accept(ModItem.NETHER_POTATO.get());
                        pOutput.accept(ModItem.NETHERITE_POTATO.get());
                        pOutput.accept(ModItem.NETHERI_STAR_POTATO.get());
                        pOutput.accept(ModItem.OBSIDIAN_POTATO.get());
                        pOutput.accept(ModItem.COOKED_PIGOTATO.get());
                        pOutput.accept(ModItem.BONE_POTATO.get());
                        pOutput.accept(ModItem.REDSTONE_POTATO.get());
                        pOutput.accept(ModItem.SPIDER_POTATO.get());
                        pOutput.accept(ModItem.STEAM_POTATO.get());
                        pOutput.accept(ModItem.APPOTATO.get());
                        pOutput.accept(ModItem.CXK_POTATO.get());
                        pOutput.accept(ModItem.HEART_POTATO.get());
                        pOutput.accept(ModItem.SLIME_POTATO.get());
                        pOutput.accept(ModItem.CHICKEN_POTATO.get());
                        pOutput.accept(ModItem.BASKET_POTATO.get());
                        pOutput.accept(ModItem.POTATOSWORD.get());




                        //原石工艺联动 原石土豆
                        if(ModList.get().isLoaded("primogemcraft")){
                            pOutput.accept(PCItem.PRIOMGEN_POTATO.get());
                        }
                        //AE2 土豆單元
                        if(ModList.get().isLoaded("ae2")){
                            pOutput.accept(AEItem.POTATO_STORAGE_CELL.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus){
        LARGESUPERPOTATOS.register(eventBus);
    }
}