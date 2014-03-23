package com.thegrovesyproject.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.thegrovesyproject.item.TMItem;

public class TutCrop extends BlockCrops{

	
	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i()
    {
        return TMItem.tutSeed;
    }

	/**
	 * crop
	 */
	@Override
    protected Item func_149865_P()
    {
        return TMItem.tutCrop;
    }
	
}
