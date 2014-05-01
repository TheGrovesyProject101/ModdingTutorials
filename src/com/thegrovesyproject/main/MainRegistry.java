package com.thegrovesyproject.main;

import com.thegrovesyproject.block.TMBlock;
import com.thegrovesyproject.creativetabs.TMCreativeTabs;
import com.thegrovesyproject.entity.TMEntity;
import com.thegrovesyproject.handler.CraftingManager;
import com.thegrovesyproject.handler.TMGuiHandler;
import com.thegrovesyproject.item.TMItem;
import com.thegrovesyproject.lib.Strings;
import com.thegrovesyproject.world.TMWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {
	
	@SidedProxy(clientSide = "com.thegrovesyproject.main.ClientProxy", serverSide = "com.thegrovesyproject.main.ServerProxy") 
	public static ServerProxy proxy;
	
	
	@Instance(Strings.MODID)
	public static MainRegistry modInstance;
	
	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		TMCreativeTabs.initialiseTabs();
		TMBlock.mainRegistry();
		TMItem.mainRegistry();
		TMEntity.mainRegistry();
		CraftingManager.mainRegistry();
		TMWorld.mainRegistry();
		TMHooks.mainRegistry();
		
		proxy.registerTileEntities();
		proxy.registerRenderThings();
	}
	
	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public static void load(FMLInitializationEvent event){
		proxy.registerNetworkStuff();
	}
	
	/**
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
}
