package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDict {
	
	public static void AddOres() {
		OreDictionary.registerOre("blockSlate", new ItemStack(Symbology.slate_block));
        OreDictionary.registerOre("plankWood", new ItemStack(Symbology.ash_plank));
        OreDictionary.registerOre("logWood", new ItemStack(Symbology.ash_log));
        OreDictionary.registerOre("oreSilver", new ItemStack(Symbology.silver_ore));
        OreDictionary.registerOre("oreRuby", new ItemStack(Symbology.ruby_ore));
	}

}
