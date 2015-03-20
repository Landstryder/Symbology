package com.teamrune.symbology.items;

import java.util.List;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.enums.EnumRuneTypes;
import com.teamrune.symbology.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
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
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		EnumRuneTypes types = EnumRuneTypes.byMetadata(stack.getMetadata());
    	if (types.getDescription() != null) {
    		tooltip.add(types.getColor() + types.getDescription());
    	}
    	
    }

}
