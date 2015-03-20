package com.teamrune.symbology.enums;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IStringSerializable;

public enum EnumRuneBlocks implements IStringSerializable {
	
	BLANK(0, "blankruneblock"),
	EARTH(1, "earthruneblock"),
	AIR(2, "airruneblock"),
	FIRE(3, "fireruneblock"),
	WATER(4, "waterruneblock"),
	MAGIC(5, "magicruneblock"),
    TARGET(6, "targetruneblock");
	
	public int getMetadata() {
		return this.meta;
	}
	
	public static EnumRuneBlocks byMetadata(int meta) {
		if (meta < 0 || meta >= META_LOOKUP.length) {
			meta = 0;
		}
		return META_LOOKUP[meta];
	}
	
	public String getName() {
		return this.name;
	}
	
	private final int meta;
	private final String name;
	private static final EnumRuneBlocks[] META_LOOKUP = new EnumRuneBlocks[values().length];
	
	private EnumRuneBlocks(int i_meta, String i_name) {
		this.meta = i_meta;
		this.name = i_name;
	}
	
	static {
		for (EnumRuneBlocks value : values()) {
			META_LOOKUP[value.getMetadata()] = value;
		}
	}
	
}