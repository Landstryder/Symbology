package com.teamrune.symbology.enums;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IStringSerializable;

public enum EnumRuneTypes implements IStringSerializable {
	
	BLANK(0, "blankrune", null, EnumChatFormatting.RESET),
	EARTH(1, "earthrune", "Elemental", EnumChatFormatting.GREEN),
	AIR(2, "airrune", "Elemental", EnumChatFormatting.WHITE),
	FIRE(3, "firerune", "Elemental", EnumChatFormatting.RED),
	WATER(4, "waterrune", "Elemental", EnumChatFormatting.BLUE),
	GOOD(5, "goodrune", "Alignment", EnumChatFormatting.WHITE),
	EVIL(6, "evilrune", "Alignment", EnumChatFormatting.RED),
	LAW(7, "lawrune", "Alignment", EnumChatFormatting.WHITE),
	CHAOS(8, "chaosrune", "Alignment", EnumChatFormatting.YELLOW),
	BIRTH(9, "birthrune", "Life", EnumChatFormatting.BLUE),
	DEATH(10, "deathrune", "Life",  EnumChatFormatting.DARK_GRAY),
	SLEEP(11, "sleeprune", "Life", EnumChatFormatting.BLUE),
	PAIN(12, "painrune", "Life", EnumChatFormatting.RED),
	CONSUMPTION(13, "consumptionrune", "Life", EnumChatFormatting.YELLOW),
	FEAR(14, "fearrune", "Emotion", EnumChatFormatting.RED),
	CONFUSION(15, "confusionrune", "Emotion",  EnumChatFormatting.BLUE),
	DESPAIR(16, "despairrune", "Emotion", EnumChatFormatting.WHITE),
	CHARM(17, "charmrune", "Emotion", EnumChatFormatting.YELLOW),
	LOVE(18, "loverune", "Emotion", EnumChatFormatting.YELLOW),
	HATE(19, "haterune", "Emotion", EnumChatFormatting.RED),
	LIGHT(20, "lightrune", "Color", EnumChatFormatting.YELLOW),
	DARK(21, "darkrune", "Color",  EnumChatFormatting.DARK_GRAY),
	RED(22, "redrune", "Color", EnumChatFormatting.RED),
	BLUE(23, "bluerune", "Color", EnumChatFormatting.BLUE),
	GREEN(24, "greenrune", "Color", EnumChatFormatting.GREEN),
	INVISIBILITY(25, "invisibilityrune", "Color",  EnumChatFormatting.DARK_GRAY),
	MAGIC(26, "magicrune", "Power", EnumChatFormatting.YELLOW),
	UNDEAD(27, "undeadrune", "Power", EnumChatFormatting.YELLOW),
	ENERGYDRAIN(28, "energydrainrune", "Power", EnumChatFormatting.YELLOW),
	PERMANENCE(29, "permanencerune", "Power", EnumChatFormatting.YELLOW),
	DIMENSION(30, "dimensionrune", "Power", EnumChatFormatting.YELLOW),
	INFLICT(31, "inflictrune", "Conditions", EnumChatFormatting.WHITE),
	PROTECT(32, "protectrune", "Conditions", EnumChatFormatting.WHITE),
	AREA(33, "arearune", "Conditions", EnumChatFormatting.YELLOW),
	TRIGGER(34, "triggerrune", "Conditions", EnumChatFormatting.WHITE),
	SILENT(35, "silentrune", "Conditions", EnumChatFormatting.WHITE),
    SELF(36, "selfrune", "Target",  EnumChatFormatting.DARK_GRAY),
    OTHER(37, "otherrune", "Target",  EnumChatFormatting.DARK_GRAY),
    TIME(38, "timerune", "Target", EnumChatFormatting.WHITE),
    WORLD(39, "worldrune", "Target", EnumChatFormatting.GREEN);
	
	public int getMetadata() {
		return this.meta;
	}
	
	public static EnumRuneTypes byMetadata(int meta) {
		if (meta < 0 || meta >= META_LOOKUP.length) {
			meta = 0;
		}
		return META_LOOKUP[meta];
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.cat;
	}
	
	public String getDescription() {
		return this.cat;
	}
	
	public EnumChatFormatting getColor() {
		return this.color;
	}
	
	private final int meta;
	private final String name;
	private final String cat;
	private final EnumChatFormatting color;
	private static final EnumRuneTypes[] META_LOOKUP = new EnumRuneTypes[values().length];
	
	private EnumRuneTypes(int i_meta, String i_name, String i_cat, EnumChatFormatting i_color) {
		this.meta = i_meta;
		this.name = i_name;
		this.cat = i_cat;
		this.color = i_color;
	}
	
	static {
		for (EnumRuneTypes value : values()) {
			META_LOOKUP[value.getMetadata()] = value;
		}
	}
	
}