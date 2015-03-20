package com.teamrune.symbology.registers;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemRune;
import com.teamrune.symbology.items.ItemRuneBlock;
import com.teamrune.symbology.reference.Reference;

public class RegisterItems {

	// Add Items
    public static void itemRegisters() {
    	Symbology.rune = new ItemRune();
        
        RegisterHelper.registerItem(Symbology.rune);
    }

}
