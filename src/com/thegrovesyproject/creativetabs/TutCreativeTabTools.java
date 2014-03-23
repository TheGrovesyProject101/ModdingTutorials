package com.thegrovesyproject.creativetabs;

import com.thegrovesyproject.item.TMItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutCreativeTabTools extends CreativeTabs {

	public TutCreativeTabTools(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return TMItem.tutPickaxe;
	}

}
