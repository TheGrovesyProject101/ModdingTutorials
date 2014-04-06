package com.thegrovesyproject.main;


import com.thegrovesyproject.handler.TMGuiHandler;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ServerProxy {

	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

}
