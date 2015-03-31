package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemSilverIngot extends Item
{
    public ItemSilverIngot()
    {
        super();
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("silver_ingot");
    }
}
