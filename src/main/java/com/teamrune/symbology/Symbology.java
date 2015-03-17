package com.teamrune.symbology;

import com.teamrune.symbology.proxies.CommonProxySymbology;

import com.teamrune.symbology.reference.Reference;
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

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerSounds();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
