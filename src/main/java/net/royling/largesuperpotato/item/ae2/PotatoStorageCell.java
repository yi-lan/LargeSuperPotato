package net.royling.largesuperpotato.item.ae2;


import appeng.api.config.FuzzyMode;
import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import appeng.api.storage.cells.IBasicCellItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class PotatoStorageCell extends Item implements IBasicCellItem {
    public PotatoStorageCell(Properties properties){
        super(properties);
    }
    @Override
    public AEKeyType getKeyType(){
        return AEKeyType.items();
    }
    @Override
    public int getBytes(ItemStack cellItem){
        return 16384;
    }
    @Override
    public int getBytesPerType(ItemStack cellItem){
        return 127;
    }
    @Override
    public int getTotalTypes(ItemStack cellItem){
        return 127;
    }
    @Override
    public double getIdleDrain(){
        return 0.5;
    }
    @Override
    public boolean isStorageCell(ItemStack i){
        return true;
    }
    @Override
    public boolean isBlackListed(ItemStack cellItem, AEKey requestedAddition){
        return false;
    }
    @Override
    public boolean storableInStorageCell() {
        return false; // 不能存储在其他存储单元中
    }
    @Override
    public void addCellInformationToTooltip(ItemStack is, List<Component> lines) {
        // 添加工具提示信息
        IBasicCellItem.super.addCellInformationToTooltip(is, lines);
    }
    @Override
    public Optional<TooltipComponent> getCellTooltipImage(ItemStack is){
        return IBasicCellItem.super.getCellTooltipImage(is);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,List<Component> tooltip,TooltipFlag flag){
        super.appendHoverText(stack,level,tooltip,flag);
        addCellInformationToTooltip(stack,tooltip);
    }

    @Override
    public FuzzyMode getFuzzyMode(ItemStack is) {
        return FuzzyMode.valueOf(is.getOrCreateTag().getString("FuzzyMode"));
    }

    @Override
    public void setFuzzyMode(ItemStack is, FuzzyMode fzMode) {
        is.getOrCreateTag().putString("FuzzyMode", fzMode.name());
    }
}
