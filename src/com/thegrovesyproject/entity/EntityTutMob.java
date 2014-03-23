package com.thegrovesyproject.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.thegrovesyproject.item.TMItem;

public class EntityTutMob extends EntityAnimal{

	public EntityTutMob(World par1World) {
		super(par1World);
		this.setSize(0.2F, 0.5F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.7D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(5, new EntityAITempt(this, 0.9D, Items.coal, false));
		
	}

	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}
	
	/**
	 * Random Drop Between 0 - 2 dropped at a time
	 */
	protected Item getDropItem(){
		return TMItem.tutItem;
	}
	
	protected void dropFewItems(boolean par1, int par2){
		int random = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);
		
		for(int k = 0; k < random; ++k){
			if(k == 2){
				this.dropItem(Items.gold_ingot, 2);
			}else if(k == 1){
				this.dropItem(Items.diamond, 1);
			}
		}
		
		if(this.isBurning()){
			this.dropItem(Items.coal, 12);
		}
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return new EntityTutMob(worldObj);
	}

}
