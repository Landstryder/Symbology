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
        Symbology.silver_ingot = new ItemSilverIngot();
        Symbology.gold_dust = new ItemGoldDust();
        Symbology.silver_dust = new ItemSilverDust();
        Symbology.charcoal_dust = new ItemCharcoalDust();
        Symbology.ruby_dust = new ItemRubyDust();
        Symbology.aventurine_dust = new ItemAventurineDust();
        Symbology.topaz_dust = new ItemTopazDust();
        Symbology.ruby_gem = new ItemRubyGem();
        Symbology.aventurine_gem = new ItemAventurineGem();
        Symbology.topaz_gem = new ItemTopazGem();

        
        RegisterHelper.registerItem(Symbology.rune);
        RegisterHelper.registerItem(Symbology.mortar);
        RegisterHelper.registerItem(Symbology.scribe);
        RegisterHelper.registerItem(Symbology.rune_matrix);
        RegisterHelper.registerItem(Symbology.silver_ingot);
        RegisterHelper.registerItem(Symbology.silver_dust);
        RegisterHelper.registerItem(Symbology.gold_dust);
        RegisterHelper.registerItem(Symbology.charcoal_dust);
        RegisterHelper.registerItem(Symbology.ruby_dust);
        RegisterHelper.registerItem(Symbology.aventurine_dust);
        RegisterHelper.registerItem(Symbology.topaz_dust);
        RegisterHelper.registerItem(Symbology.ruby_gem);
        RegisterHelper.registerItem(Symbology.aventurine_gem);
        RegisterHelper.registerItem(Symbology.topaz_gem);
    }

}
