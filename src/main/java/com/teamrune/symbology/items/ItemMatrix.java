package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.gui.container.ContainerMatrixCrafter;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
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
        playerIn.displayGui(new ItemMatrix.InterfaceCraftingTable(worldIn, playerIn.getPosition()));
        return itemStackIn;
    }
    
    public static class InterfaceCraftingTable implements IInteractionObject
    {
        private final World world;
        private final BlockPos position;

        public InterfaceCraftingTable(World worldIn, BlockPos pos)
        {
            this.world = worldIn;
            this.position = pos;
        }

        /**
         * Gets the name of this command sender (usually username, but possibly "Rcon")
         */
        public String getName()
        {
            return null;
        }

        /**
         * Returns true if this thing is named
         */
        public boolean hasCustomName()
        {
            return false;
        }

        public IChatComponent getDisplayName()
        {
            return new ChatComponentTranslation(Blocks.crafting_table.getUnlocalizedName() + ".name", new Object[0]);
        }

        public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
        {
            return new ContainerMatrixCrafter(playerInventory, this.world, this.position);
        }

        public String getGuiID()
        {
            return "minecraft:crafting_table";
        }
    }
}
