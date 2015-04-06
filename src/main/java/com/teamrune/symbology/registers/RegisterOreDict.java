package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDict {
	
	public static void AddOres() {
		OreDictionary.registerOre("blockSlate", Symbology.slate_block);
        OreDictionary.registerOre("plankWood", Symbology.ash_plank);
        OreDictionary.registerOre("logWood", Symbology.ash_log);
        OreDictionary.registerOre("oreSilver", Symbology.silver_ore);
        OreDictionary.registerOre("oreRuby", Symbology.ruby_ore);
        OreDictionary.registerOre("oreTopaz", Symbology.topaz_ore);
        OreDictionary.registerOre("oreAventurine", Symbology.aventurine_ore);
        OreDictionary.registerOre("ingotSilver", Symbology.silver_ingot);
        OreDictionary.registerOre("dustSilver", Symbology.silver_dust);
        OreDictionary.registerOre("dustRuby", Symbology.ruby_dust);
        OreDictionary.registerOre("gemRuby", Symbology.ruby_gem);
        OreDictionary.registerOre("dustTopaz", Symbology.topaz_dust);
        OreDictionary.registerOre("gemTopaz", Symbology.topaz_gem);
        OreDictionary.registerOre("dustAventurine", Symbology.aventurine_dust);
        OreDictionary.registerOre("gemAventurine", Symbology.aventurine_gem);
        OreDictionary.registerOre("dustCharcoal", Symbology.charcoal_dust);
	}
}
