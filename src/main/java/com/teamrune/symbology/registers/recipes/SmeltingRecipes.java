package com.teamrune.symbology.registers.recipes;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemScribe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(Symbology.silver_ore), new ItemStack(Symbology.silver_ingot), (float) .1);
    }
}
