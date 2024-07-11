package net.royling.largesuperpotato.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class potatogearsword extends SwordItem {
    public potatogearsword(){
        super(new Tier() {
            @Override
            public int getUses() {
                return 1888;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 3f;
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
        },6,-2.3f,new Properties());
    }
}
