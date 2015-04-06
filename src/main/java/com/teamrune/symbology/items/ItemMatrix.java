package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemMatrix extends Item
{
    public ItemMatrix()
        {
            super();
            setMaxDamage(0);
            setMaxStackSize(1);
            setCreativeTab(Symbology.symbologyTab);
            setUnlocalizedName("rune_matrix");
        }

    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {

        playerIn.displayGui(new BlockWorkbench.InterfaceCraftingTable(worldIn, playerIn.getPosition()));
        return itemStackIn;
    }
}
