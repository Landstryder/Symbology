package com.teamrune.symbology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.teamrune.symbology.Symbology;


public class BlockSlateBlock extends Block
{
    public BlockSlateBlock()
    {
        super(Material.rock);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("slate_block");
        setHarvestLevel("pickaxe", 0);
        setHardness(2.0F);
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
}
