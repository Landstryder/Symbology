package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemTopazDust extends Item
{
    public ItemTopazDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("topaz_dust");
    }
}