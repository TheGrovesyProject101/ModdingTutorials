package com.thegrovesyproject.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.thegrovesyproject.item.TMItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRecipies();
		addSmeltingRecipies();
	}

	public static void addCraftingRecipies() {
		// Shaped Recipie
		GameRegistry.addRecipe(new ItemStack(TMItem.tutPickaxe, 1), new Object[] { "###", " S ", " S ", '#', TMItem.tutItem, 'S', Items.stick });
		
		//Shapeless Recipie
		GameRegistry.addShapelessRecipe(new ItemStack(TMItem.tutItem, 10), new Object[]{Blocks.dirt , Blocks.cobblestone});
	}

	public static void addSmeltingRecipies() {
		GameRegistry.addSmelting(TMItem.tutItem, new ItemStack(Blocks.diamond_block, 5), 20.0F);
	}
}
