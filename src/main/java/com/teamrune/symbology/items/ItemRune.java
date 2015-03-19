package com.teamrune.symbology.items;

import java.util.List;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRune extends Item
{
    public ItemRune()
    {
        super();
        setMaxDamage(0);
        setMaxStackSize(16);
        setCreativeTab(Symbology.runesTab);
        setUnlocalizedName("rune");
        setHasSubtypes(true);
    }
    
    @Override
    public int getMetadata(int damage) {
    	return damage;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List subItems) {
    	
    	for (EnumRuneTypes types : EnumRuneTypes.values()) {
    		
    		int typeBits = types.getMetadata();
    		int metadata = typeBits;
    		ItemStack subItemStack = new ItemStack(item, 1, metadata);
    		subItems.add(subItemStack);
    		
    	}
    	
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
    	int metadata = stack.getMetadata();
    	int typeBits = metadata;
    	
    	EnumRuneTypes type = EnumRuneTypes.byMetadata(typeBits);
    	return super.getUnlocalizedName() + "." + type.getName();
    }
    
    @Override
    public String getItemStackDisplayName(ItemStack stack) {
    	
    	String s = ("" + StatCollector.translateToLocal(this.getUnlocalizedName(stack) + ".name")).trim();
    	
    	return s;
    }
    
    public static enum EnumRuneTypes implements IStringSerializable {
    	
    	BLANK(0, "blankrune"),
    	EARTH(1, "earthrune"),
    	AIR(2, "airrune"),
    	FIRE(3, "firerune"),
    	WATER(4, "waterrune"),
    	GOOD(5, "goodrune"),
    	EVIL(6, "evilrune"),
    	LAW(7, "lawrune"),
    	CHAOS(8, "chaosrune"),
    	BIRTH(9, "birthrune"),
    	DEATH(10, "deathrune"),
    	SLEEP(11, "sleeprune"),
    	PAIN(12, "painrune"),
    	CONSUMPTION(13, "consumptionrune"),
    	FEAR(14, "fearrune"),
    	CONFUSION(15, "confusionrune"),
    	DESPAIR(16, "despairrune"),
    	CHARM(17, "charmrune"),
    	LOVE(18, "loverune"),
    	HATE(19, "haterune"),
    	LIGHT(20, "lightrune"),
    	DARK(21, "darkrune"),
    	RED(22, "redrune"),
    	BLUE(23, "bluerune"),
    	GREEN(24, "greenrune"),
    	INVISIBILITY(25, "invisibilityrune"),
    	MAGIC(26, "magicrune"),
    	UNDEAD(27, "undeadrune"),
    	ENERGYDRAIN(28, "energydrainrune"),
    	PERMANENCE(29, "permanencerune"),
    	DIMENSION(30, "dimensionrune"),
    	INFLICT(31, "inflictrune"),
    	PROTECT(32, "protectrune"),
    	AREA(33, "arearune"),
    	TRIGGER(34, "triggerrune"),
    	SILENT(35, "silentrune"),
        SELF(36, "selfrune"),
        OTHER(37, "otherrune"),
        TIME(38, "timerune"),
        WORLD(39, "worldrune");
    	
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
    	
    	private final int meta;
    	private final String name;
    	private static final EnumRuneTypes[] META_LOOKUP = new EnumRuneTypes[values().length];
    	
    	private EnumRuneTypes(int i_meta, String i_name) {
    		this.meta = i_meta;
    		this.name = i_name;
    	}
    	
    	static {
    		for (EnumRuneTypes value : values()) {
    			META_LOOKUP[value.getMetadata()] = value;
    		}
    	}
    	
    }
    

}
