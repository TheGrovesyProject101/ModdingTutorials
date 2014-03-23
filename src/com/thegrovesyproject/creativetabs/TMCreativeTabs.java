package com.thegrovesyproject.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class TMCreativeTabs {
	
	public static CreativeTabs tabBlock;
	public static CreativeTabs tabMisc;
	public static CreativeTabs tabCombat;
	public static CreativeTabs tabTools;
	
	public static void initialiseTabs(){
		tabBlock = new TutCreativeTabBlock("TutBlockTab");
		tabMisc = new TutCreativeTabMisc("TutMiscTab");
		tabCombat = new TutCreativeTabCombat("TutCombatTab");
		tabTools = new TutCreativeTabTools("TutToolsTab");
	}
}
