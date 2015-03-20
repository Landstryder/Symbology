package com.teamrune.symbology;

import com.teamrune.symbology.blocks.BlockBlankRuneBlock;
import com.teamrune.symbology.proxies.CommonProxySymbology;

import com.teamrune.symbology.reference.Reference;
import com.teamrune.symbology.registers.RegisterBlocks;
import com.teamrune.symbology.registers.RegisterItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Symbology {
	@SidedProxy(clientSide = "com.teamrune.symbology.client.ClientProxySymbology", serverSide = "com.teamrune.symbology.proxies.CommonProxySymbology")
	public static CommonProxySymbology proxy;

	@Instance("symbology")
	public static Symbology instance;
	
	public static Item rune;
	public static Block blank_rune_block;
	public static Block air_rune_block;
	public static Block earth_rune_block;
	public static Block water_rune_block;
	public static Block fire_rune_block;
	public static Block target_rune_block;
	public static Block magic_rune_block;
	public static Block slate_block;
	
	public static CreativeTabs runesTab = new CreativeTabs("SymbologyRunes") {
		public Item getTabIconItem() {
			return rune;
		}
	};
	
	public static CreativeTabs symbologyTab = new CreativeTabs("Symbology") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(blank_rune_block);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		RegisterBlocks.blockRegisters();
		RegisterItems.itemRegisters();
		proxy.addVariants();
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerSounds();
		proxy.registerRenders();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
