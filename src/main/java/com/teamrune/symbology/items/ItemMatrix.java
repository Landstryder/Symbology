package com.teamrune.symbology.items;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.gui.container.ContainerMatrixCrafter;

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
        playerIn.displayGui(new ItemMatrix.InterfaceCraftingTable(worldIn, playerIn.getPosition()));
        return itemStackIn;
    }
    
    public static class InterfaceCraftingTable extends BlockWorkbench.InterfaceCraftingTable implements IInteractionObject
    {
        private final World world;
        private final BlockPos position;

        public InterfaceCraftingTable(World worldIn, BlockPos pos)
        {
        	super(worldIn, pos);
            this.world = worldIn;
            this.position = pos;
        }

        @Override
        public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
        {
            return new ContainerMatrixCrafter(playerInventory, this.world, this.position);
        }
    }
}
