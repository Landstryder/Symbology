package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemCharcoalDust extends Item
{
    public ItemCharcoalDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("charcoal_dust");
    }
}