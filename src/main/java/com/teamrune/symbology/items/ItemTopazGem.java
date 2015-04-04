package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemTopazGem extends Item
{
    public ItemTopazGem()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("topaz_gem");
    }
}