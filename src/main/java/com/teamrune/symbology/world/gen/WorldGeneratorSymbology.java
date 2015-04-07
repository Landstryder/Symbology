package com.teamrune.symbology.world.gen;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.teamrune.symbology.Symbology;
import com.teamrune.symbology.blocks.BlockAshSapling;

public class WorldGeneratorSymbology implements IWorldGenerator {
	
	public Random randomGenerator;
	public BlockPos field_180294_c;
	public World currentWorld;
	
	public WorldGenerator slateGen;
    public WorldGenerator silverGen;
    public WorldGenerator topazGen;
    public WorldGenerator rubyGen;
    public WorldGenerator aventurineGen;
	
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

        silverGen = new WorldGenMinable(Symbology.silver_ore.getDefaultState(), 2 + random.nextInt(8));
        topazGen = new WorldGenMinable(Symbology.topaz_ore.getDefaultState(), 5);
        rubyGen = new WorldGenMinable(Symbology.ruby_ore.getDefaultState(), 5);
        aventurineGen = new WorldGenMinable(Symbology.aventurine_ore.getDefaultState(), 5);
		slateGen = new WorldGenMinable(Symbology.slate_block.getDefaultState(), 33);
		
		//generateOres(int attempts, int minY, int randY, int randX, int randZ, int chunkX, int chunkZ, WorldGenerator gen, World world, Random random)
		this.generateOres(5, 0, 80, 16, 16, chunkX, chunkZ, slateGen, world, random);
		this.generateOres(2, 10, 20, 16, 16, chunkX, chunkZ, silverGen, world, random);
		this.generateOres(2, 20, 30, 16, 16, chunkX, chunkZ, topazGen, world, random);
		this.generateOres(2, 30, 30, 16, 16, chunkX, chunkZ, rubyGen, world, random);
		this.generateOres(3, 40, 30, 16, 16, chunkX, chunkZ, aventurineGen, world, random);
		
		for(int h = 0; h < 2; h++) {
			int xCoord = chunkX * 16 + random.nextInt(16);
			int zCoord = chunkZ * 16 + random.nextInt(16);
			Random rand = new Random();
			int gen = rand.nextInt(3);
			BlockPos pos = world.getTopSolidOrLiquidBlock(new BlockPos(xCoord, 0, zCoord));
			if ((world.getBiomeGenForCoords(pos).biomeName == BiomeGenBase.forest.biomeName || world.getBiomeGenForCoords(pos).biomeName == BiomeGenBase.birchForest.biomeName || world.getBiomeGenForCoords(pos).biomeName == BiomeGenBase.forestHills.biomeName || world.getBiomeGenForCoords(pos).biomeName == BiomeGenBase.birchForestHills.biomeName) && gen < 1) {
				if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, random, pos)) return;
		        Object object = random.nextInt(10) == 0 ? new WorldGenBigSymbologyTree(true) : new WorldGenSymbologyTrees(true);
		        int i = 0;
		        int j = 0;
		        boolean flag = false;

		        IBlockState iblockstate1 = Blocks.air.getDefaultState();
		        IBlockState state = Symbology.ash_sapling.getDefaultState().withProperty(BlockAshSapling.STAGE, 1);

		        if (flag)
		        {
		            world.setBlockState(pos.add(i, 0, j), iblockstate1, 4);
		            world.setBlockState(pos.add(i + 1, 0, j), iblockstate1, 4);
		            world.setBlockState(pos.add(i, 0, j + 1), iblockstate1, 4);
		            world.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate1, 4);
		        }
		        else
		        {
		            world.setBlockState(pos, iblockstate1, 4);
		        }

		        if (!((WorldGenerator)object).generate(world, random, pos.add(i, 0, j)))
		        {
		            if (flag)
		            {
		                world.setBlockState(pos.add(i, 0, j), state, 4);
		                world.setBlockState(pos.add(i + 1, 0, j), state, 4);
		                world.setBlockState(pos.add(i, 0, j + 1), state, 4);
		                world.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
		            }
		            else
		            {
		                world.setBlockState(pos, state, 4);
		            }
		        }
			}
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}
	
	private void generateOres(int attempts, int minY, int randY, int randX, int randZ, int chunkX, int chunkZ, WorldGenerator gen, World world, Random random) {
		for(int i = 0; i < attempts; i++) {
            int xCoord = chunkX * 16 + random.nextInt(randX);
            int yCoord = minY + random.nextInt(randY);
            int zCoord = chunkZ * 16 + random.nextInt(randZ);
            BlockPos pos = new BlockPos(xCoord, yCoord, zCoord);
            if ((world.getBlockState(pos).getBlock() == Blocks.stone) || (world.getBlockState(pos).getBlock() == Symbology.slate_block)) {
                gen.generate(world, random, pos);
            }
        }
	}
	
}