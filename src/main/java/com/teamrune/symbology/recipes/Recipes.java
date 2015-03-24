package com.teamrune.symbology.recipes;

import com.teamrune.symbology.Symbology;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(Symbology.mortar), "sts", " s ", 's', new ItemStack(Blocks.stone), 't', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(Symbology.scribe), "il ", "lil", " ld", 'i', new ItemStack(Items.iron_ingot), 'l', new ItemStack(Items.leather), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(Symbology.blank_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 0), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.fire_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 3), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.water_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 4), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.air_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 2), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.earth_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 1), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.magic_rune_block), "grg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Symbology.rune, 1, 26), 's', new ItemStack(Symbology.slate_block));
        GameRegistry.addRecipe(new ItemStack(Symbology.earth_rune_block), "gmg", "rsr", "grg", 'g', new ItemStack(Items.gold_ingot), 'm', new ItemStack(Symbology.rune_matrix), 'r', new ItemStack(Symbology.rune, 1, 26), 's', new ItemStack(Symbology.slate_block));

    }
}
