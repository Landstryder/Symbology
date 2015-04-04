package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemAventurineDust extends Item
{
    public ItemAventurineDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("aventurine_dust");
    }
}