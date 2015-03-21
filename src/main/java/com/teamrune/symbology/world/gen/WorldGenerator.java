package com.teamrune.symbology.world.gen;

import java.util.Random;

import com.teamrune.symbology.Symbology;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~In generate method!~~~~~~~~~~~~~~~~~~~");
		switch(world.provider.getDimensionId()) {
		case 1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurfaceWorld(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

	}

	private void generateSurfaceWorld(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 25; i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~In surface method!~~~~~~~~~~~~~~~~~~~");
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(55) + 15;
			int zCoord = chunkX + random.nextInt(16);
			System.out.println("X:" + xCoord + " Y:" + yCoord + " Z:" + zCoord);
			
			
			(new WorldGenMinable(Symbology.slate_block.getDefaultState(), 25)).generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}
	
}