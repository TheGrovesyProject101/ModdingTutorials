package com.thegrovesyproject.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends EntityThrowable{

	public EntityGrenade(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}
	
	public EntityGrenade(World world, EntityLivingBase enity){
		super(world, enity);
	}

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		for(int i = 0; i < 10; i++){
			this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 0.9F, 0.9F, 0.9F);
		}
		
		if(!this.worldObj.isRemote){
			this.setDead();
			if(!this.worldObj.isRemote){
				this.worldObj.createExplosion((Entity) null, this.posX,  this.posY,  this.posZ, 4.5F, true);
			}
		}
	}

}
