package com.teamrune.symbology.client.model;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.SimpleBakedModel.Builder;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import com.google.common.base.Function;
import com.teamrune.symbology.blocks.models.BlankRuneBlockModel;

public class BakedBlankRuneBlockModel extends SmartBlockModel {
	
	public BakedBlankRuneBlockModel(VertexFormat format, Function<ResourceLocation, TextureAtlasSprite> bakedTextureGetter) {
		super(false, false, bakedTextureGetter.apply(BlankRuneBlockModel.model), format, bakedTextureGetter);
	}
	
	@Override
	public IBakedModel handleBlockState(IBlockState state) {
		Builder b = new Builder(this, null);
		b.setTexture(this.getTexture());
		//b.addGeneralQuad(myquad);
		//b.addFaceQuad(EnumFacing.UP, myquad);
		return b.makeBakedModel();
	}

}
