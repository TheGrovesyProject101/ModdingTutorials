package com.thegrovesyproject.main;


import com.thegrovesyproject.handler.TMGuiHandler;
import com.thegrovesyproject.lib.Strings;
import com.thegrovesyproject.tile_entity.TileEntityTutChest;
import com.thegrovesyproject.tile_entity.TileEntityTutFurnace;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {

	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityTutChest.class, Strings.MODID);
		GameRegistry.registerTileEntity(TileEntityTutFurnace.class, "TileEntityTutFurnace");
	}
}
