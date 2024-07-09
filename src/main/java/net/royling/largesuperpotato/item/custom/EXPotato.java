package net.royling.largesuperpotato.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.royling.largesuperpotato.event.GeneratorEXP;
import net.royling.largesuperpotato.item.ModFood;

public class EXPotato extends Item{
    public EXPotato(){
        super(new Item.Properties().food(ModFood.EXPOTATO));
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity){
        ItemStack retval = super.finishUsingItem(itemstack,world,entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        GeneratorEXP.execute(world,x,y,z);
        return retval;
    }
}
