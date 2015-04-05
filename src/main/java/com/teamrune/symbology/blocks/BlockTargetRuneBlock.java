package com.teamrune.symbology.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.enums.EnumRuneBlocks;

public class BlockTargetRuneBlock extends Block
{
    public BlockTargetRuneBlock()
    {
        super(Material.rock);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("target_rune_block");
        setHarvestLevel("pickaxe", 2);
        setHardness(10.0F);
    }
    
    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
    	return EnumWorldBlockLayer.SOLID;
    }
    
    @Override
    public boolean isOpaqueCube() {
    	return true;
    }
    
    @Override
    public boolean isFullCube() {
    	return true;
    }
    
    @Override
    public int getRenderType() {
    	return 3;
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
    	return true;
    }
}
