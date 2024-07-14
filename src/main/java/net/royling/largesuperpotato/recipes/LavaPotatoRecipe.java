package net.royling.largesuperpotato.recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.royling.largesuperpotato.item.p1_0.ModItem;

public class LavaPotatoRecipe implements IBrewingRecipe {

    @Override
    public boolean isInput(ItemStack itemStack) {
        return Ingredient.of(new ItemStack(Items.POTATO)).test(itemStack);
    }

    @Override
    public boolean isIngredient(ItemStack itemStack) {
        return Ingredient.of(new ItemStack(Items.BLAZE_ROD)).test(itemStack);

    }

    @Override
    public ItemStack getOutput(ItemStack itemStack, ItemStack itemStack1) {
        if (isInput(itemStack) && isIngredient(itemStack1)) {
            return new ItemStack(ModItem.LAVA_POTATO.get());
        }
        return ItemStack.EMPTY;

    }
}
