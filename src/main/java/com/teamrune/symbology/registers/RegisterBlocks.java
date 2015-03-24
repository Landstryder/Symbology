package com.teamrune.symbology.registers;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.blocks.BlockAirRuneBlock;
import com.teamrune.symbology.blocks.BlockAshLog;
import com.teamrune.symbology.blocks.BlockBlankRuneBlock;
import com.teamrune.symbology.blocks.BlockCraftingRuneBlock;
import com.teamrune.symbology.blocks.BlockEarthRuneBlock;
import com.teamrune.symbology.blocks.BlockFireRuneBlock;
import com.teamrune.symbology.blocks.BlockMagicRuneBlock;
import com.teamrune.symbology.blocks.BlockSlateBlock;
import com.teamrune.symbology.blocks.BlockTargetRuneBlock;
import com.teamrune.symbology.blocks.BlockWaterRuneBlock;

public class RegisterBlocks {

	// Add Block
    public static void blockRegisters() {
    	Symbology.blank_rune_block = new BlockBlankRuneBlock();
    	Symbology.air_rune_block = new BlockAirRuneBlock();
    	Symbology.earth_rune_block = new BlockEarthRuneBlock();
    	Symbology.water_rune_block = new BlockWaterRuneBlock();
    	Symbology.fire_rune_block = new BlockFireRuneBlock();
    	Symbology.magic_rune_block = new BlockMagicRuneBlock();
    	Symbology.target_rune_block = new BlockTargetRuneBlock();
    	Symbology.crafting_rune_block = new BlockCraftingRuneBlock();
    	Symbology.slate_block = new BlockSlateBlock();
    	Symbology.ash_log = new BlockAshLog();
        
        RegisterHelper.registerBlock(Symbology.blank_rune_block);
        RegisterHelper.registerBlock(Symbology.air_rune_block);
        RegisterHelper.registerBlock(Symbology.earth_rune_block);
        RegisterHelper.registerBlock(Symbology.water_rune_block);
        RegisterHelper.registerBlock(Symbology.fire_rune_block);
        RegisterHelper.registerBlock(Symbology.magic_rune_block);
        RegisterHelper.registerBlock(Symbology.target_rune_block);
        RegisterHelper.registerBlock(Symbology.crafting_rune_block);
        RegisterHelper.registerBlock(Symbology.slate_block);
        RegisterHelper.registerBlock(Symbology.ash_log);
    }
	
}
