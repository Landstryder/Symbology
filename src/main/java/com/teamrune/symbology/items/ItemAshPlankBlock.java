package com.teamrune.symbology.items;

import com.teamrune.symbology.enums.EnumRuneBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemAshPlankBlock extends ItemBlock
{

    public ItemAshPlankBlock(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        EnumRuneBlocks types = EnumRuneBlocks.byMetadata(stack.getMetadata());
        return super.getUnlocalizedName() + "." + types.toString();
    }

}
