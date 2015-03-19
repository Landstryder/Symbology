package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemRune;

public class RegisterItems {

	// Add Items
    public static void itemRegisters() {
    	Symbology.rune = new ItemRune();
        
        RegisterHelper.registerItem(Symbology.rune);
    }

}
