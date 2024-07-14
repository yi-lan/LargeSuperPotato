package net.royling.largesuperpotato.item.potatodelight;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.royling.largesuperpotato.item.p1_0.ModFood;


public class PotatoKnife extends SwordItem {
    public PotatoKnife(){
        super(new Tier() {
            @Override
            public int getUses() {
                return 176;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 2f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 2;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(ItemTags.create(new ResourceLocation("forge:potatoes")));
            }
        },1,-2.0f,new Properties().food(ModFood.POTATO_KNIFE));
    }
}
