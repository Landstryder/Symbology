package com.teamrune.symbology.client;

import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemRune;
import com.teamrune.symbology.proxies.CommonProxySymbology;
import com.teamrune.symbology.reference.Reference;
import com.teamrune.symbology.registers.RegisterHelper;
import com.teamrune.symbology.enums.EnumRuneBlocks;
import com.teamrune.symbology.enums.EnumRuneTypes;

public class ClientProxySymbology extends CommonProxySymbology {

	public void registerSounds() {
	}

	public void registerRenders() {
		for (EnumRuneTypes types : EnumRuneTypes.values()) {
			String itemModelName = types.getName();
			int metadata = types.getMetadata();
			
			RegisterHelper.registerItemRenders(Symbology.rune, metadata, itemModelName);
		}
		
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.blank_rune_block), 0, "blank_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.air_rune_block), 0, "air_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.earth_rune_block), 0, "earth_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.water_rune_block), 0, "water_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.fire_rune_block), 0, "fire_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.magic_rune_block), 0, "magic_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.target_rune_block), 0, "target_rune_block");
		RegisterHelper.registerItemRenders(Item.getItemFromBlock(Symbology.slate_block), 0, "slate_block");
	}

	public void addVariants() {
		ModelBakery.addVariantName(Symbology.rune,
				Reference.MOD_ID + ":blank_rune",
				Reference.MOD_ID + ":earth_rune",
				Reference.MOD_ID + ":air_rune",
				Reference.MOD_ID + ":fire_rune",
				Reference.MOD_ID + ":water_rune",
				Reference.MOD_ID + ":good_rune",
				Reference.MOD_ID + ":evil_rune",
				Reference.MOD_ID + ":law_rune",
				Reference.MOD_ID + ":chaos_rune",
				Reference.MOD_ID + ":birth_rune",
				Reference.MOD_ID + ":death_rune",
				Reference.MOD_ID + ":sleep_rune",
				Reference.MOD_ID + ":pain_rune",
				Reference.MOD_ID + ":consumption_rune",
				Reference.MOD_ID + ":fear_rune",
				Reference.MOD_ID + ":confusion_rune",
				Reference.MOD_ID + ":despair_rune",
				Reference.MOD_ID + ":charm_rune",
				Reference.MOD_ID + ":love_rune",
				Reference.MOD_ID + ":hate_rune",
				Reference.MOD_ID + ":light_rune",
				Reference.MOD_ID + ":dark_rune",
				Reference.MOD_ID + ":red_rune",
				Reference.MOD_ID + ":blue_rune",
				Reference.MOD_ID + ":green_rune",
				Reference.MOD_ID + ":invisibility_rune",
				Reference.MOD_ID + ":magic_rune",
				Reference.MOD_ID + ":undead_rune",
				Reference.MOD_ID + ":energy_drain_rune",
				Reference.MOD_ID + ":permanence_rune",
				Reference.MOD_ID + ":dimension_rune",
				Reference.MOD_ID + ":inflict_rune",
				Reference.MOD_ID + ":protect_rune",
				Reference.MOD_ID + ":area_rune",
				Reference.MOD_ID + ":trigger_rune",
				Reference.MOD_ID + ":silent_rune",
                Reference.MOD_ID + ":self_rune",
                Reference.MOD_ID + ":other_rune",
                Reference.MOD_ID + ":time_rune",
                Reference.MOD_ID + ":world_rune");
		
	}

}
