package com.teamrune.symbology.client.model;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teamrune.symbology.blocks.models.BlankRuneBlockModel;
import com.teamrune.symbology.reference.Reference;

@SideOnly(Side.CLIENT)
public class CustomModelLoader implements ICustomModelLoader {
	
	private IResourceManager resourceManager;
	
	String path = "models/block/builtin";
	
	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}
	
	@Override
	public boolean accepts(ResourceLocation l) {
		return l.getResourceDomain().equals(Reference.MOD_ID) && l.getResourcePath().startsWith(path);
	}
	
	@Override
	public IModel loadModel(ResourceLocation l) {
		String r = l.getResourcePath().substring(path.length());
		if (r.equals(Reference.MOD_ID)) {
			return new BlankRuneBlockModel(resourceManager);
		}
		throw new RuntimeException("A builtin model '" + r + "' is not defined.");
	}

}
