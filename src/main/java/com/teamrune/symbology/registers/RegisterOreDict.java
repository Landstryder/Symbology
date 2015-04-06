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
	}

}
