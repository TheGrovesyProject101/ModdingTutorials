package com.thegrovesyproject.main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.thegrovesyproject.entity.EntityGrenade;
import com.thegrovesyproject.entity.EntityTutMob;
import com.thegrovesyproject.item.TMItem;
import com.thegrovesyproject.model.ModelTutMob;
import com.thegrovesyproject.render.RenderTutMob;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityTutMob.class, new RenderTutMob(new ModelTutMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(TMItem.tutGrenade));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
