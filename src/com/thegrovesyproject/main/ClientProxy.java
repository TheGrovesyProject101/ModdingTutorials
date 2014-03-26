package com.thegrovesyproject.main;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.thegrovesyproject.block.TMBlock;
import com.thegrovesyproject.entity.EntityGrenade;
import com.thegrovesyproject.entity.EntityTutMob;
import com.thegrovesyproject.item.TMItem;
import com.thegrovesyproject.model.ModelTutMob;
import com.thegrovesyproject.render.RenderTutMob;
import com.thegrovesyproject.render.item.ItemRenderTutChest;
import com.thegrovesyproject.render.tile_entity.TutChestRenderer;
import com.thegrovesyproject.tile_entity.TileEntityTutChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityTutMob.class, new RenderTutMob(new ModelTutMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(TMItem.tutGrenade));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutChest.class, new TutChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(TMBlock.tutChest), new ItemRenderTutChest());
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
