package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemSilverDust extends Item
{
    public ItemSilverDust()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("silver_dust");
    }
}
