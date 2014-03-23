package com.thegrovesyproject.creativetabs;

import com.thegrovesyproject.item.TMItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutCreativeTabCombat extends CreativeTabs {

	public TutCreativeTabCombat(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return TMItem.tutSword;
	}

}
