package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemMatrix extends Item
{
    public ItemMatrix()
        {
            super();
            setMaxDamage(0);
            setMaxStackSize(1);
            setCreativeTab(Symbology.symbologyTab);
            setUnlocalizedName("rune_matrix");
        }
}
