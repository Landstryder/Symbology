package com.teamrune.symbology.blocks.models;

import com.google.common.base.Function;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IFlexibleBakedModel;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.IModelState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.Collection;

import com.teamrune.symbology.client.model.BakedBlankRuneBlockModel;
import com.teamrune.symbology.reference.Reference;

@SideOnly(Side.CLIENT)
public class BlankRuneBlockModel implements IModel {
	
	public static final ResourceLocation base = new ResourceLocation(Reference.MOD_ID + ":blocks/blank_rune_block/blank_rune_block_all");
	public static final ResourceLocation left_border = new ResourceLocation(Reference.MOD_ID + ":blocks/left_border");
	public static final ResourceLocation right_border = new ResourceLocation(Reference.MOD_ID + ":blocks/right_border");
	public static final ResourceLocation top_border = new ResourceLocation(Reference.MOD_ID + ":blocks/top_border");
	public static final ResourceLocation bottom_border = new ResourceLocation(Reference.MOD_ID + ":blocks/bottom_border");
	public static final ResourceLocation model = new ResourceLocation(Reference.MOD_ID + "block/blank_rune_block/blank_rune_block");
	
	public BlankRuneBlockModel (IResourceManager resourceManager) {
		
	}
	
	@Override
	public Collection<ResourceLocation> getDependencies() {
		return Arrays.asList(model);
	}
	
	@Override
	public Collection<ResourceLocation> getTextures() {
		return Arrays.asList(base, left_border, right_border, top_border, bottom_border);
	}
	
	@Override
	public IFlexibleBakedModel bake(IModelState state, VertexFormat format, Function<ResourceLocation, TextureAtlasSprite> bakedTextureGetter) {
		return new BakedBlankRuneBlockModel(format, bakedTextureGetter);
	}
	
	@Override
	public IModelState getDefaultState() {
		return null;
	}

}
