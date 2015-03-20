package com.teamrune.symbology.enums;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IStringSerializable;

public enum EnumRuneTypes implements IStringSerializable {
	
	BLANK(0, "blank_rune", null, EnumChatFormatting.RESET),
	EARTH(1, "earth_rune", "Elemental", EnumChatFormatting.GREEN),
	AIR(2, "air_rune", "Elemental", EnumChatFormatting.WHITE),
	FIRE(3, "fire_rune", "Elemental", EnumChatFormatting.RED),
	WATER(4, "water_rune", "Elemental", EnumChatFormatting.BLUE),
	GOOD(5, "good_rune", "Alignment", EnumChatFormatting.WHITE),
	EVIL(6, "evil_rune", "Alignment", EnumChatFormatting.RED),
	LAW(7, "law_rune", "Alignment", EnumChatFormatting.WHITE),
	CHAOS(8, "chaos_rune", "Alignment", EnumChatFormatting.YELLOW),
	BIRTH(9, "birth_rune", "Life", EnumChatFormatting.BLUE),
	DEATH(10, "death_rune", "Life",  EnumChatFormatting.DARK_GRAY),
	SLEEP(11, "sleep_rune", "Life", EnumChatFormatting.BLUE),
	PAIN(12, "pain_rune", "Life", EnumChatFormatting.RED),
	CONSUMPTION(13, "consumption_rune", "Life", EnumChatFormatting.YELLOW),
	FEAR(14, "fear_rune", "Emotion", EnumChatFormatting.RED),
	CONFUSION(15, "confusion_rune", "Emotion",  EnumChatFormatting.BLUE),
	DESPAIR(16, "despair_rune", "Emotion", EnumChatFormatting.WHITE),
	CHARM(17, "charm_rune", "Emotion", EnumChatFormatting.YELLOW),
	LOVE(18, "love_rune", "Emotion", EnumChatFormatting.YELLOW),
	HATE(19, "hate_rune", "Emotion", EnumChatFormatting.RED),
	LIGHT(20, "light_rune", "Color", EnumChatFormatting.YELLOW),
	DARK(21, "dark_rune", "Color",  EnumChatFormatting.DARK_GRAY),
	RED(22, "red_rune", "Color", EnumChatFormatting.RED),
	BLUE(23, "blue_rune", "Color", EnumChatFormatting.BLUE),
	GREEN(24, "green_rune", "Color", EnumChatFormatting.GREEN),
	INVISIBILITY(25, "invisibility_rune", "Color",  EnumChatFormatting.DARK_GRAY),
	MAGIC(26, "magic_rune", "Power", EnumChatFormatting.YELLOW),
	UNDEAD(27, "undead_rune", "Power", EnumChatFormatting.YELLOW),
	ENERGYDRAIN(28, "energy_drain_rune", "Power", EnumChatFormatting.YELLOW),
	PERMANENCE(29, "permanence_rune", "Power", EnumChatFormatting.YELLOW),
	DIMENSION(30, "dimension_rune", "Power", EnumChatFormatting.YELLOW),
	INFLICT(31, "inflict_rune", "Conditions", EnumChatFormatting.WHITE),
	PROTECT(32, "protect_rune", "Conditions", EnumChatFormatting.WHITE),
	AREA(33, "area_rune", "Conditions", EnumChatFormatting.YELLOW),
	TRIGGER(34, "trigger_rune", "Conditions", EnumChatFormatting.WHITE),
	SILENT(35, "silent_rune", "Conditions", EnumChatFormatting.WHITE),
    SELF(36, "self_rune", "Target",  EnumChatFormatting.DARK_GRAY),
    OTHER(37, "other_rune", "Target",  EnumChatFormatting.DARK_GRAY),
    TIME(38, "time_rune", "Target", EnumChatFormatting.WHITE),
    WORLD(39, "world_rune", "Target", EnumChatFormatting.GREEN);
	
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