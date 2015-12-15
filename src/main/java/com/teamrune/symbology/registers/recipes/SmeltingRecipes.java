package com.teamrune.symbology.registers.recipes;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemScribe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(Symbology.silver_ore), new ItemStack(Symbology.silver_ingot), (float) .1);
        GameRegistry.addSmelting(new ItemStack(Symbology.ash_log), new ItemStack(Items.coal, 1, 1), (float) .1);
    }
}
