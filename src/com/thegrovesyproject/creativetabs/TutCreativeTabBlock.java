package com.thegrovesyproject.creativetabs;

import com.thegrovesyproject.block.TMBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutCreativeTabBlock extends CreativeTabs {

	public TutCreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(TMBlock.tutBlock);
	}

}
