package com.teamrune.symbology.registers.recipes;

import com.teamrune.symbology.Symbology;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingRecipes
{
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
        GameRegistry.addRecipe(new ItemStack(Symbology.target_rune_block), "gsg", "sbs", "gsg", 'g', new ItemStack(Items.gold_ingot), 's', new ItemStack(Symbology.silver_ingot), 'b', new ItemStack(Symbology.slate_block));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.ash_plank, 4), new ItemStack(Symbology.ash_log));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.rune, 1, 0), new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Symbology.slate_block));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.aventurine_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Symbology.aventurine_gem));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.ruby_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Symbology.ruby_gem));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.topaz_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Symbology.topaz_gem));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.gold_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.gold_ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.silver_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Symbology.silver_ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(Symbology.charcoal_dust), new ItemStack(Symbology.mortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 0, 1));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 1), " s ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.aventurine_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 2), " s ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 3), " s ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 4), " s ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.topaz_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 5), " s ", " b ", "d d", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 6), " s ", " b ", "d d", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 7), " s ", "dbd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 8), " s ", "dbd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 9), "ds ", "db ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.topaz_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 10), "ds ", "db ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.charcoal_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 11), " s ", " b ", "dd ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.topaz_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 12), " s ", " b ", " dd", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 13), "ds ", "db ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 14), " sd", " bd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 15), " sd", " bd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.topaz_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 16), " sd", " bd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 17), "dsd", " b ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 18), " s ", "dbd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 19), "dsd", " b ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 20), " s ", " b ", "dtd", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust), 't', new ItemStack(Blocks.torch));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 21), " sd", "db ", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.charcoal_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 22), "ds ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.ruby_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 23), "ds ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.topaz_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 24), "ds ", " b ", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.aventurine_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 25), " s ", "dbd", " g ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust), 'g', new ItemStack(Blocks.glass));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 26), " s ", "dbd", " d ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 27), " s ", " b ", "dfd", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust), 'f', new ItemStack(Items.rotten_flesh));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 28), " s ", " b ", "dhd", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust), 'h', new ItemStack(Blocks.hopper));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 29), "gsg", "dbd", "rat", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust), 'g', new ItemStack(Items.diamond), 'a', new ItemStack(Symbology.aventurine_gem), 'r', new ItemStack(Symbology.ruby_gem), 't', new ItemStack(Symbology.topaz_gem));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 30), "dsd", " b ", "d d", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 31), "   ", "sbd", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 32), "   ", "dbs", "   ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 33), " s ", "dbd", " t ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.gold_dust), 't', new ItemStack(Blocks.tnt));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 34), " s ", "dbd", " w ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust), 'w', new ItemStack(Blocks.tripwire_hook));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 35), " s ", "dbd", " w ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust), 'w', new ItemStack(Blocks.wool));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 36), " s ", "dbd", " b ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.charcoal_dust), 'b', new ItemStack(Items.glass_bottle));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 37), " s ", "dbd", " a ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.charcoal_dust),'a', new ItemStack(Items.arrow));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 38), " s ", "dbd", " a ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.silver_dust),'a', new ItemStack(Items.arrow));
        GameRegistry.addRecipe(new ItemStack(Symbology.rune, 1, 39), " s ", "dbd", " e ", 's', new ItemStack(Symbology.scribe, 1, OreDictionary.WILDCARD_VALUE), 'b', new ItemStack(Symbology.rune, 1, 0), 'd', new ItemStack(Symbology.aventurine_dust), 'e', new ItemStack(Blocks.dirt));
    }
}
