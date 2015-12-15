package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemCompoundRune extends Item
{
    public ItemCompoundRune()
    {
        super();
        setCreativeTab(Symbology.runesTab);
        setUnlocalizedName("compound_rune");
    }
}