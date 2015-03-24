package com.teamrune.symbology.client.model;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IFlexibleBakedModel;
import net.minecraftforge.client.model.ISmartBlockModel;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.base.Function;

@SideOnly(Side.CLIENT)
public abstract class SmartBlockModel implements IFlexibleBakedModel, ISmartBlockModel {
	
	private boolean isAmbientOcclusion;
	private boolean isGui3d;
	private TextureAtlasSprite texture;
	private VertexFormat format;
	protected Function<ResourceLocation, TextureAtlasSprite> textureGetter;
	
	public SmartBlockModel(boolean ambientOcclusion, boolean gui3d, TextureAtlasSprite texture, VertexFormat format, Function<ResourceLocation, TextureAtlasSprite> bakedTextureGetter) {
		this.isAmbientOcclusion = ambientOcclusion;
		this.isGui3d = gui3d;
		this.texture = texture;
		this.format = format;
		this.textureGetter = bakedTextureGetter;
	}
	
	@Override
	public boolean isAmbientOcclusion() {
		return isAmbientOcclusion;
	}
	
	@Override
	public boolean isGui3d() {
		return isGui3d;
	}
	
	@Override
	public boolean isBuiltInRenderer() {
		return false;
	}
	
	@Override
	public TextureAtlasSprite getTexture() {
		return texture;
	}
	
	@Override
	public ItemCameraTransforms getItemCameraTransforms() {
		return ItemCameraTransforms.DEFAULT;
	}
	
	@Override
	public List<BakedQuad> getFaceQuads(EnumFacing side) {
		return Collections.EMPTY_LIST;
	}
	
	@Override
	public List<BakedQuad> getGeneralQuads() {
		return Collections.EMPTY_LIST;
	}
	
	@Override
	public VertexFormat getFormat() {
		return format;
	}
}
