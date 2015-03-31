package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;

import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDict {
	
	public static void AddOres() {
		OreDictionary.registerOre("blockSlate", Symbology.slate_block);
	}

}
