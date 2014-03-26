package com.thegrovesyproject.tile_entity;

import com.thegrovesyproject.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class TMTileEntity {

	public static void mainRegistry(){
		registerTileEntity();
	}

	private static void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityTutChest.class, Strings.MODID);
	}
	
}
