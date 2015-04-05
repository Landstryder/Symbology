package com.teamrune.symbology.blocks;

import com.teamrune.symbology.Symbology;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockAshPlank extends Block
{
    public BlockAshPlank()
    {
        super(Material.wood);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("ash_plank");
        setHarvestLevel("axe", 0);
        setHardness(3.0F);
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