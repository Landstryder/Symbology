package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;

public class ItemScribe extends Item
{
    public ItemScribe()
    {
        super();
        setMaxDamage(256);
        setMaxStackSize(1);
        setCreativeTab(Symbology.runesTab);
        setUnlocalizedName("runescribe");
    }
}
