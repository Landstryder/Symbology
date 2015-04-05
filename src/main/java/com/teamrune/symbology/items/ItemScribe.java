package com.teamrune.symbology.items;

import com.teamrune.symbology.Symbology;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemScribe extends Item
{
    public ItemScribe() {
        super();
        setMaxDamage(256);
        setMaxStackSize(1);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("scribe");
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
        return true;
    }

    @Override
    public boolean isRepairable()
    {
        return true;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemstack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack cStack = itemStack.copy();
        cStack.setItemDamage(cStack.getItemDamage() + 1);
        cStack.stackSize = 1;
        return cStack;
    }
}
