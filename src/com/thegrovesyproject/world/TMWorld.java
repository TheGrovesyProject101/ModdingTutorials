package com.thegrovesyproject.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class TMWorld {
	public static void mainRegistry(){
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen(){
		registerWorldGen(new TutWorldGenOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}
