package net.royling.largesuperpotato.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.largesuperpotato.LargeSuperPotato;

public class ModMobEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LargeSuperPotato.MOD_ID);

    public static final RegistryObject<MobEffect> STOMACH_BLEEDING = EFFECTS.register("stomach_bleeding", StomachBleedingEffect::new);
}
