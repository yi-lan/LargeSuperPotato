package net.royling.largesuperpotato.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    // <editor-fold desc="1.0food">
    public static final FoodProperties PIGOTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(2).saturationMod(0.1f).build();

    public static final FoodProperties CREEPOTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(2).saturationMod(0.2f)
            .effect(()->new MobEffectInstance(MobEffects.BLINDNESS,200),0.8f).build();

    public static final FoodProperties EXPOTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties DIAMOND_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.4f)
            .effect(()->new MobEffectInstance(MobEffects.NIGHT_VISION,3600,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,200,1),1f)
            .build();
    public static final FoodProperties EMERALD_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.4f)
            .effect(()->new MobEffectInstance(MobEffects.NIGHT_VISION,8000,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,300,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,3600,1),1f)
            .build();
    public static final FoodProperties ENDER_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.4f).build();
    public static final FoodProperties GLASS_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.4f)
            .effect(()->new MobEffectInstance(MobEffects.INVISIBILITY,3600,0),1f).build();
    public static final FoodProperties CHROME_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties GOLDEN_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.NIGHT_VISION,2400,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,300,0),1f).build();
    public static final FoodProperties LAVA_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,7200,0),1f).build();
    public static final FoodProperties NETHER_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,3600,0),1f).build();
    public static final FoodProperties NETHERITE_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,9600,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,9600,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,400,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.NIGHT_VISION,9600,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,9600,0),1f)
            .build();
    public static final FoodProperties NETHER_STAR_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,20000,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,20000,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION,600,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.NIGHT_VISION,20000,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,20000,1),1f)
            .effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST,20000,2),1)
            .build();
    public static final FoodProperties OBSIDIAN_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,3600,0),1f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,1200,0),1f).build();
    public static final FoodProperties COOKED_PIGOTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(7).saturationMod(0.6f).build();
    public static final FoodProperties BONE_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f).build();
    //原石工艺
    public static final FoodProperties PRIOMGEN_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties REDSTONE_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties SPIDER_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties STEAM_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties APPOTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(5).saturationMod(0.3f).build();
    public static final FoodProperties CXK_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(12).saturationMod(0.9f).build();
    public static final FoodProperties HEART_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.HEAL,1,1),1f).build();
    public static final FoodProperties SLIME_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(4).saturationMod(0.3f)
            .effect(()->new MobEffectInstance(MobEffects.JUMP,200,9),1f).build();
    public static final FoodProperties CHICKEN_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.5f).build();
    public static final FoodProperties BASKET_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.5f).build();
    // </editor-fold>
    public static final FoodProperties POTATO_FISH =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties COOKED_POTATO_FISH =new FoodProperties.Builder()
            .alwaysEat().nutrition(7).saturationMod(0.5f).build();
    public static final FoodProperties POTATO_PIECE =new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties POTATO_CHIPS =new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties POTATO_KETCHUP =new FoodProperties.Builder()
            .alwaysEat().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties MASHED_POTATO =new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties TOMATO_CHIPS =new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(0.2f).build();
    public static final FoodProperties TOMATO_CHIPS_AND_POTATO_KETCHUP =new FoodProperties.Builder()
            .alwaysEat().nutrition(10).saturationMod(0.8f).build();

}
