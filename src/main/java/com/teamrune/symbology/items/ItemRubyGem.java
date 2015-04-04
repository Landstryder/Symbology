package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemRubyGem extends Item
{
    public ItemRubyGem()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("ruby_gem");
    }
}