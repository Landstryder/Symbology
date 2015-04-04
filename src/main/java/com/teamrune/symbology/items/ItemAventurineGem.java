package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemAventurineGem extends Item
{
    public ItemAventurineGem()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("aventurine_gem");
    }
}