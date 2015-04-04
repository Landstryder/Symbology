package com.teamrune.symbology;

import com.teamrune.symbology.registers.recipes.CraftingRecipes;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teamrune.symbology.proxies.CommonProxySymbology;
import com.teamrune.symbology.reference.Reference;
import com.teamrune.symbology.registers.RegisterBlocks;
import com.teamrune.symbology.registers.RegisterItems;
import com.teamrune.symbology.world.gen.WorldGenSymbologyTrees;
import com.teamrune.symbology.world.gen.WorldGeneratorSymbology;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Symbology {
	@SidedProxy(clientSide = "com.teamrune.symbology.client.ClientProxySymbology", serverSide = "com.teamrune.symbology.proxies.CommonProxySymbology")
	public static CommonProxySymbology proxy;

	@Instance("symbology")
	public static Symbology instance;
	
	public static Item rune;
	public static Item mortar;
	public static Item scribe;
    public static Item rune_matrix;
    public static Item silver_ingot ;
    public static Item silver_dust;
    public static Item gold_dust;
    public static Item charcoal_dust;
    public static Item aventurine_gem;
    public static Item ruby_gem;
    public static Item topaz_gem ;
    public static Item aventurine_dust;
    public static Item ruby_dust;
    public static Item topaz_dust;
	public static Block blank_rune_block;
	public static Block air_rune_block;
	public static Block earth_rune_block;
	public static Block water_rune_block;
	public static Block fire_rune_block;
	public static Block target_rune_block;
	public static Block magic_rune_block;
	public static Block crafting_rune_block;
	public static Block slate_block;
	public static Block ruby_ore;
	public static Block topaz_ore;
	public static Block aventurine_ore;
	public static Block ash_log;
	public static Block ash_leaves;
	public static Block ash_sapling;
    public static Block silver_ore;
	
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
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorSymbology(), 0);
		
		proxy.registerLoaders();

		RegisterBlocks.blockRegisters();
		RegisterItems.itemRegisters();
		proxy.addVariants();
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerSounds();
		proxy.registerRenders();
        CraftingRecipes.init();
    }

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
