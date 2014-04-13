package com.thegrovesyproject.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.thegrovesyproject.gui.GuiTutFurnace;
import com.thegrovesyproject.inventory.ContainerTutFurnace;
import com.thegrovesyproject.tile_entity.TileEntityTutFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class TMGuiHandler implements IGuiHandler {

	public TMGuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityTutFurnace tileEntityFurnace = (TileEntityTutFurnace) world.getTileEntity(x, y, z);
			return new ContainerTutFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityTutFurnace tileEntityTestContainer = (TileEntityTutFurnace) world.getTileEntity(x, y, z);
			return new GuiTutFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}
