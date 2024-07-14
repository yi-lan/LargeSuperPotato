package net.royling.largesuperpotato.item.p1_0.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.royling.largesuperpotato.event.EnderPotatoEvent;
import net.royling.largesuperpotato.item.p1_0.ModFood;

public class EnderPotato extends Item {
    public EnderPotato(){
        super(new Item.Properties().food(ModFood.ENDER_POTATO));
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level world, LivingEntity entity){
        ItemStack retval = super.finishUsingItem(itemStack,world,entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        EnderPotatoEvent.execute(entity);
        return retval;
    }
}
