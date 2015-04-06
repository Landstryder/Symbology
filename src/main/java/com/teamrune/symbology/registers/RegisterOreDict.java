package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDict {
	
	public static void AddOres() {
		OreDictionary.registerOre("blockSlate", new ItemStack(Symbology.slate_block, 1));
        OreDictionary.registerOre("plankWood", new ItemStack(Symbology.ash_plank, 1));
        OreDictionary.registerOre("logWood", new ItemStack(Symbology.ash_log, 1));
        OreDictionary.registerOre("oreSilver", new ItemStack(Symbology.silver_ore, 1));
        OreDictionary.registerOre("oreRuby", new ItemStack(Symbology.ruby_ore, 1));
	}

}
