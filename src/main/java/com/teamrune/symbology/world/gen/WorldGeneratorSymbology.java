package com.teamrune.symbology.world.gen;

import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.CUSTOM;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.teamrune.symbology.Symbology;

public class WorldGeneratorSymbology implements IWorldGenerator {
	
	public Random randomGenerator;
	public BlockPos field_180294_c;
	public World currentWorld;
	
	public WorldGenerator slateGen;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		this.currentWorld = world;
		this.randomGenerator = random;
		switch(world.provider.getDimensionId()) {
		case 1:
			generateNether(world, random, chunkX, chunkZ);
		case 0:
			generateSurfaceWorld(world, random, chunkX, chunkZ);
		case -1:
			generateEnd(world, random, chunkX, chunkZ);
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

	}

	private void generateSurfaceWorld(World world, Random random, int chunkX, int chunkZ) {

		slateGen = new WorldGenMinable(Symbology.slate_block.getDefaultState(), 33);
		
		for(int i = 0; i < 5; i++) {
			int xCoord = chunkX * 16 + random.nextInt(16);
			int yCoord = random.nextInt(80);
			int zCoord = chunkZ * 16 + random.nextInt(16);
			BlockPos pos = new BlockPos(xCoord, yCoord, zCoord);
			if (world.getBlockState(pos).getBlock() == Blocks.stone) {
				slateGen.generate(world, random, pos);
			} else {
				i--;
			}
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}
	
}