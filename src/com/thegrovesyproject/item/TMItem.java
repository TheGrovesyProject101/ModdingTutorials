package com.thegrovesyproject.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.thegrovesyproject.block.TMBlock;
import com.thegrovesyproject.creativetabs.TMCreativeTabs;
import com.thegrovesyproject.lib.Strings;
import com.thegrovesyproject.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class TMItem {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);
	
	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[]{2, 5, 4, 2}, 10);
	
	public static Item tutItem;
	public static Item tutPickaxe;
	public static Item tutAxe;
	public static Item tutSword;
	public static Item tutHoe;
	public static Item tutSpade;
	
	public static Item tutHelmet;
	public static Item tutPlate;
	public static Item tutPants;
	public static Item tutBoots;
	
	public static Item tutGrenade;
	
	public static Item tutSeed;
	public static Item tutCrop;
	
	
	public static void initialiseItem() {
		tutItem = new Item().setUnlocalizedName("TutItem").setCreativeTab(TMCreativeTabs.tabMisc).setTextureName(Strings.MODID + ":TutItem");
		tutPickaxe = new TutPickaxe(tutMaterial).setUnlocalizedName("TutPickaxe").setCreativeTab(TMCreativeTabs.tabTools).setTextureName(Strings.MODID + ":TutPickaxe");
		tutAxe = new TutAxe(tutMaterial).setUnlocalizedName("TutAxe").setCreativeTab(TMCreativeTabs.tabTools).setTextureName(Strings.MODID + ":TutAxe");
		tutSword = new TutSword(tutMaterial).setUnlocalizedName("TutSword").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutSword");
		tutHoe = new TutHoe(tutMaterial).setUnlocalizedName("TutHoe").setCreativeTab(TMCreativeTabs.tabTools).setTextureName(Strings.MODID + ":TutHoe");
		tutSpade = new TutSpade(tutMaterial).setUnlocalizedName("TutSpade").setCreativeTab(TMCreativeTabs.tabTools).setTextureName(Strings.MODID + ":TutSpade");
		tutHelmet = new TutArmor(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0).setUnlocalizedName("TutHelmet").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutHelmet");
		tutPlate = new TutArmor(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 1).setUnlocalizedName("TutPlate").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutPlate");
		tutPants = new TutArmor(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 2).setUnlocalizedName("TutPants").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutPants");
		tutBoots = new TutArmor(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 3).setUnlocalizedName("TutBoots").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutBoots");
		tutGrenade = new TutGrenade().setUnlocalizedName("TutGrenade").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutGrenade");
		tutSeed = new ItemSeeds(TMBlock.tutCrop, Blocks.farmland).setCreativeTab(TMCreativeTabs.tabMisc).setUnlocalizedName("TutSeeds").setTextureName(Strings.MODID + ":TutSeeds");
		tutCrop = new Item().setCreativeTab(TMCreativeTabs.tabMisc).setUnlocalizedName("TutCropItem").setTextureName(Strings.MODID + ":TutCrop");
	}

	public static void registerItem() {
		GameRegistry.registerItem(tutItem, tutItem.getUnlocalizedName());
		GameRegistry.registerItem(tutPickaxe, tutPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(tutAxe, tutAxe.getUnlocalizedName());
		GameRegistry.registerItem(tutSword, tutSword.getUnlocalizedName());
		GameRegistry.registerItem(tutHoe, tutHoe.getUnlocalizedName());
		GameRegistry.registerItem(tutSpade, tutSpade.getUnlocalizedName());
		GameRegistry.registerItem(tutHelmet, tutHelmet.getUnlocalizedName());
		GameRegistry.registerItem(tutPlate, tutPlate.getUnlocalizedName());
		GameRegistry.registerItem(tutPants, tutPants.getUnlocalizedName());
		GameRegistry.registerItem(tutBoots, tutBoots.getUnlocalizedName());
		GameRegistry.registerItem(tutGrenade, tutGrenade.getUnlocalizedName());
		GameRegistry.registerItem(tutSeed, tutSeed.getUnlocalizedName());
		GameRegistry.registerItem(tutCrop, tutCrop.getUnlocalizedName());
	}

}
