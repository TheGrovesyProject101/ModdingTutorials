package com.thegrovesyproject.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thegrovesyproject.creativetabs.TMCreativeTabs;
import com.thegrovesyproject.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class TMBlock {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	public static Block tutBlock;
	public static Block tutCrop;

	public static void initialiseBlock() {
		tutBlock = new TutBlock(Material.ground).setBlockName("TutBlock").setCreativeTab(TMCreativeTabs.tabBlock);
		tutCrop = new TutCrop().setBlockName("TutCrop").setCreativeTab(TMCreativeTabs.tabBlock).setBlockTextureName(Strings.MODID + ":TutCrop");
	}

	public static void registerBlock() {
		GameRegistry.registerBlock(tutBlock, tutBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tutCrop, tutCrop.getUnlocalizedName());
	}
}
