package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemGoldDust extends Item
{
    public ItemGoldDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("gold_dust");
    }
}
