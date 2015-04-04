package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemRubyDust extends Item
{
    public ItemRubyDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("ruby_dust");
    }
}