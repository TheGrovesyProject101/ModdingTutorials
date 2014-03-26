package com.thegrovesyproject.render.item;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.thegrovesyproject.tile_entity.TileEntityTutChest;

public class ItemRenderTutChest implements IItemRenderer {

	private ModelChest chestModel;

	public ItemRenderTutChest() {
		chestModel = new ModelChest();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityTutChest(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
