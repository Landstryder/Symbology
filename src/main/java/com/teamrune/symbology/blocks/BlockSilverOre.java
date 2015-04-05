package com.teamrune.symbology.blocks;

import com.teamrune.symbology.Symbology;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;

public class BlockSilverOre extends Block
{
    public BlockSilverOre()
    {
        super(Material.rock);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("silver_ore");
        setHarvestLevel("pickaxe", 2);
        setHardness(4.0F);
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
