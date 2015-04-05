package com.teamrune.symbology.world.gen.village;

import java.util.List;
import java.util.Random;

import net.minecraft.util.EnumFacing;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageAltarHandler implements IVillageCreationHandler {

	@Override
	public PieceWeight getVillagePieceWeight(Random random, int i) {
		return new PieceWeight(ComponentAltar.class, 5, 1);
	}

	@Override
	public Class<?> getComponentClass() {
		return ComponentAltar.class;
	}

	@Override
	public Object buildComponent(PieceWeight villagePiece, Start startPiece,
			List pieces, Random random, int p1, int p2, int p3,
			EnumFacing facing, int p5) {
		return ComponentAltar.buildComponent(startPiece, pieces, random, p1, p2, p3, facing, p5);
	}

}
