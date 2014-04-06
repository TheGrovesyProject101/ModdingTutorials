package com.thegrovesyproject.main;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.thegrovesyproject.item.TMItem;

public class TMHooks {

	public static void mainRegistry(){
		forgeHooks();
	}
	
	public static void forgeHooks(){
		MinecraftForge.addGrassSeed(new ItemStack(TMItem.tutSeed), 20);
	}
	
}
