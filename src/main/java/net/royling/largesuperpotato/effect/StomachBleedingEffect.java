package net.royling.largesuperpotato.effect;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class StomachBleedingEffect extends MobEffect {
    public StomachBleedingEffect(){
        super(MobEffectCategory.HARMFUL,-6750208);
    }
    @Override
    public void applyEffectTick(LivingEntity entity,int amplifier){
        execute(entity.level(),entity,2.0f*(amplifier+1));
    }
    @Override
    public boolean isDurationEffectTick(int duration,int amplifier){
        return true;
    }

    public static void execute(LevelAccessor world, Entity entity,float damage) {
        if (entity == null)
            return;
        entity.hurt(new DamageSource(world.registryAccess()
                .registryOrThrow(Registries.DAMAGE_TYPE)
                .getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("largesuperpotato:eatknife")))), damage);
    }
}
