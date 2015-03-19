package com.teamrune.symbology.blocks;

import com.teamrune.symbology.Symbology;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockRuneCrafter extends Block
{
    public BlockRuneCrafter()
    {
        super(Material.rock);
        setCreativeTab(Symbology.runesTab);
        setUnlocalizedName("runeenchanter");
    }
}