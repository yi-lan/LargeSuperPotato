package net.royling.largesuperpotato;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.royling.largesuperpotato.effect.ModMobEffects;
import net.royling.largesuperpotato.item.ae2.AEItem;
import net.royling.largesuperpotato.item.create.CreatePotatoItem;
import net.royling.largesuperpotato.item.feitem.FEItem;
import net.royling.largesuperpotato.item.ModCreativeTab;
import net.royling.largesuperpotato.item.p1_0.ModItem;
import net.royling.largesuperpotato.item.potatodelight.DelightItem;
import net.royling.largesuperpotato.item.priomgemcreate.PCItem;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LargeSuperPotato.MOD_ID)
public class LargeSuperPotato
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "largesuperpotato";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public LargeSuperPotato()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeTab.register(modEventBus);

        ModItem.register(modEventBus);

        if(ModList.get().isLoaded("primogemcraft")){
            PCItem.register(modEventBus);
        }
        if(ModList.get().isLoaded("ae2")){
            AEItem.register(modEventBus);
        }
        if(ModList.get().isLoaded("create")) {
            CreatePotatoItem.register(modEventBus);
        }
        if(ModList.get().isLoaded("farmersdelight"))
        {
            DelightItem.register(modEventBus);
        }
        FEItem.register(modEventBus);

        ModMobEffects.EFFECTS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);


        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
