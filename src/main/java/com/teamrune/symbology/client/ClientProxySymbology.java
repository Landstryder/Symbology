package com.teamrune.symbology.client;

import net.minecraft.client.resources.model.ModelBakery;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.items.ItemRune;
import com.teamrune.symbology.proxies.CommonProxySymbology;
import com.teamrune.symbology.reference.Reference;
import com.teamrune.symbology.registers.RegisterHelper;

public class ClientProxySymbology extends CommonProxySymbology {

	public void registerSounds() {
	}

	public void registerRenders() {
		for (ItemRune.EnumRuneTypes types : ItemRune.EnumRuneTypes.values()) {
			String itemModelName = types.getName();
			int metadata = types.getMetadata();
			
			RegisterHelper.registerItemRenders(Symbology.rune, metadata, itemModelName);
		}
	}

	public void addVariants() {
		ModelBakery.addVariantName(Symbology.rune, Reference.MOD_ID + ":blankrune",
				Reference.MOD_ID + ":earthrune",
				Reference.MOD_ID + ":airrune",
				Reference.MOD_ID + ":firerune",
				Reference.MOD_ID + ":waterrune",
				Reference.MOD_ID + ":goodrune",
				Reference.MOD_ID + ":evilrune",
				Reference.MOD_ID + ":lawrune",
				Reference.MOD_ID + ":chaosrune",
				Reference.MOD_ID + ":birthrune",
				Reference.MOD_ID + ":deathrune",
				Reference.MOD_ID + ":sleeprune",
				Reference.MOD_ID + ":painrune",
				Reference.MOD_ID + ":consumptionrune",
				Reference.MOD_ID + ":fearrune",
				Reference.MOD_ID + ":confusionrune",
				Reference.MOD_ID + ":despairrune",
				Reference.MOD_ID + ":charmrune",
				Reference.MOD_ID + ":loverune",
				Reference.MOD_ID + ":haterune",
				Reference.MOD_ID + ":lightrune",
				Reference.MOD_ID + ":darkrune",
				Reference.MOD_ID + ":redrune",
				Reference.MOD_ID + ":bluerune",
				Reference.MOD_ID + ":greenrune",
				Reference.MOD_ID + ":invisibilityrune",
				Reference.MOD_ID + ":magicrune",
				Reference.MOD_ID + ":undeadrune",
				Reference.MOD_ID + ":energydrainrune",
				Reference.MOD_ID + ":permanencerune",
				Reference.MOD_ID + ":dimensionrune",
				Reference.MOD_ID + ":inflictrune",
				Reference.MOD_ID + ":protectrune",
				Reference.MOD_ID + ":arearune",
				Reference.MOD_ID + ":triggerrune",
				Reference.MOD_ID + ":silentrune");
	}

}
