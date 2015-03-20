package com.teamrune.symbology.registers;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemMortar;
import com.teamrune.symbology.items.ItemRune;
import com.teamrune.symbology.items.ItemRuneBlock;
import com.teamrune.symbology.items.ItemScribe;
import com.teamrune.symbology.reference.Reference;

public class RegisterItems {

	// Add Items
    public static void itemRegisters() {
    	Symbology.rune = new ItemRune();
    	Symbology.mortar = new ItemMortar();
    	Symbology.scribe = new ItemScribe();
        
        RegisterHelper.registerItem(Symbology.rune);
        RegisterHelper.registerItem(Symbology.mortar);
        RegisterHelper.registerItem(Symbology.scribe);
    }

}
