package com.teamrune.symbology.registers;

import com.teamrune.symbology.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.reference.Reference;
import scala.tools.nsc.transform.patmat.Logic;

public class RegisterItems {

	// Add Items
    public static void itemRegisters() {
    	Symbology.rune = new ItemRune();
    	Symbology.mortar = new ItemMortar();
    	Symbology.scribe = new ItemScribe();
        Symbology.rune_matrix = new ItemMatrix();
        
        RegisterHelper.registerItem(Symbology.rune);
        RegisterHelper.registerItem(Symbology.mortar);
        RegisterHelper.registerItem(Symbology.scribe);
        RegisterHelper.registerItem(Symbology.rune_matrix);
    }

}
