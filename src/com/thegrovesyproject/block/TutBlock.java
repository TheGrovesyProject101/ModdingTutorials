package com.thegrovesyproject.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TutBlock extends Block {

	protected TutBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	public void onEntityWalking(World world, int par2, int par3, int par4, Entity entity) {
		if(entity instanceof EntityLivingBase){
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 200, 100));
		}
	}
}
