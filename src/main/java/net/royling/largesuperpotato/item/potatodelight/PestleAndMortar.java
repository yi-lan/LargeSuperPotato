package net.royling.largesuperpotato.item.potatodelight;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;


public class PestleAndMortar extends Item {
    public PestleAndMortar() {
        super(new Item.Properties().durability(32).rarity(Rarity.COMMON));
    }
    @Override
    public boolean hasCraftingRemainingItem(){
        return true;
    }
    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack){
        ItemStack titem = new ItemStack(this);
        titem.setDamageValue(itemstack.getDamageValue()+1);
        if(titem.getDamageValue() >= titem.getMaxDamage()){
            return ItemStack.EMPTY;
        }
        return titem;
    }
    @Override
    public boolean isRepairable(@NotNull ItemStack itemStack){
        return false;
    }
}
