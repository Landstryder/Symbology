package com.teamrune.symbology.world.gen.village;

import static net.minecraftforge.common.ChestGenHooks.DUNGEON_CHEST;
import static net.minecraftforge.common.ChestGenHooks.VILLAGE_BLACKSMITH;

import java.util.List;
import java.util.Random;

import com.teamrune.symbology.Symbology;

import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.common.ChestGenHooks;

public class ComponentAltar extends StructureVillagePieces.House1 {
	
	private int averageGroundLevel = -1;
	private Random rand;
	
	public ComponentAltar() {}

    public ComponentAltar(StructureVillagePieces.Start start, int p_i45571_2_, Random rand, StructureBoundingBox box, EnumFacing face)
    {
        super(start, p_i45571_2_, rand, box, face);
        this.coordBaseMode = face;
        this.boundingBox = box;
    }

    public static ComponentAltar buildComponent(StructureVillagePieces.Start start, List l, Random rand, int x, int y, int z, EnumFacing face, int weight)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 10, 7, 10, face);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(l, structureboundingbox) == null ? new ComponentAltar(start, weight, rand, structureboundingbox, face) : null;
    }

    /**
     * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
     * Mineshafts at the end, it adds Fences...
     */
    public boolean addComponentParts(World worldIn, Random rand, StructureBoundingBox box)
    {
    	this.rand = rand;
        if (this.averageGroundLevel < 0)
        {
            this.averageGroundLevel = this.getAverageGroundLevel(worldIn, box);

            if (this.averageGroundLevel < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 6 - 1, 0);
        }
        int k;
        int l;
        
        //Floor
        for (k = 0; k <= 10; k++) {
        	for (l = 0; l <= 10; l++) {
        		int ran = rand.nextInt(99);
        		if (ran <= 9) {
        			super.setBlockState(worldIn, Symbology.blank_rune_block.getDefaultState(), k, 0, l, box);
        		} else if(ran <= 34 && ran >= 10) {
        			super.setBlockState(worldIn, Blocks.gravel.getDefaultState(), k, 0, l, box);
        		} else {
        			super.setBlockState(worldIn, Blocks.mossy_cobblestone.getDefaultState(), k, 0, l, box);
        		}
        	}
        }
        
        //Fire Arch
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 3, 1, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 2, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 3, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 4, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 4, 4, 0, box);
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 7, 1, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 2, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 3, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 4, 0, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 6, 4, 0, box);
		this.placeBlock(worldIn, Symbology.fire_rune_block.getDefaultState(), 5, 4, 0, box);
		
		//Air Arch
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 10, 1, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 2, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 3, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 3, box);
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 10, 1, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 2, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 3, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 4, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 6, box);
		this.placeBlock(worldIn, Symbology.air_rune_block.getDefaultState(), 10, 4, 5, box);
		

		//Water Arch
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 3, 1, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 2, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 3, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 3, 4, 10, box);
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 7, 1, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 2, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 3, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 7, 4, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 4, 4, 10, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 6, 4, 10, box);
		this.placeBlock(worldIn, Symbology.water_rune_block.getDefaultState(), 5, 4, 10, box);
		

		//Earth Arch
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 0, 1, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 2, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 3, 3, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 3, box);
		this.placeBlock(worldIn, Symbology.magic_rune_block.getDefaultState(), 0, 1, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 2, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 3, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 7, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 4, box);
		this.placeBlock(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 6, box);
		this.placeBlock(worldIn, Symbology.earth_rune_block.getDefaultState(), 0, 4, 5, box);
		
		//Targets
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 5, 1, 2, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 7, 1, 3, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 8, 1, 5, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 7, 1, 7, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 5, 1, 8, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 3, 1, 7, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 2, 1, 5, box);
		this.placeBlock(worldIn, Symbology.target_rune_block.getDefaultState(), 3, 1, 3, box);
		this.placeBlock(worldIn, Symbology.crafting_rune_block.getDefaultState(), 5, 1, 5, box);
		
		//Hole
		for (k=3; k<9; k++){
			for (l=3; l<9; l++) {
				for (int z=-1; z>-6; z--) {
					super.setBlockState(worldIn, Blocks.mossy_cobblestone.getDefaultState(), k, z, l, box);
				}
			}
		}
		
		for (k=4; k<7; k++){
			for (l=4; l<7; l++) {
				for (int z=-1; z>-5; z--) {
					super.setBlockState(worldIn, Blocks.air.getDefaultState(), k, z, l, box);
				}
			}
		}
		
		this.generateChestContents(worldIn, box, rand, 5, -4, 5, ChestGenHooks.getItems(DUNGEON_CHEST, rand), ChestGenHooks.getCount(DUNGEON_CHEST, rand));

		for (k=3; k<9; k++){
			for (l=3; l<9; l++) {
				super.setBlockState(worldIn, Blocks.tnt.getDefaultState(), k, -6, l, box);
			}
		}

        return true;
    }

    protected int func_180779_c(int p_180779_1_, int p_180779_2_)
    {
        return 1;
    }
    
    @Override
    protected boolean generateChestContents(World worldIn, StructureBoundingBox p_180778_2_, Random p_180778_3_, int p_180778_4_, int p_180778_5_, int p_180778_6_, List p_180778_7_, int p_180778_8_)
    {
        BlockPos blockpos = new BlockPos(this.getXWithOffset(p_180778_4_, p_180778_6_), this.getYWithOffset(p_180778_5_), this.getZWithOffset(p_180778_4_, p_180778_6_));

        if (p_180778_2_.isVecInside(blockpos) && worldIn.getBlockState(blockpos).getBlock() != Blocks.chest)
        {
            IBlockState iblockstate = Blocks.trapped_chest.getDefaultState();
            worldIn.setBlockState(blockpos, ((BlockChest) Blocks.trapped_chest).correctFacing(worldIn, blockpos, iblockstate), 2);
            TileEntity tileentity = worldIn.getTileEntity(blockpos);

            if (tileentity instanceof TileEntityChest)
            {
                WeightedRandomChestContent.generateChestContents(p_180778_3_, p_180778_7_, (TileEntityChest)tileentity, p_180778_8_);
            }

            return true;
        }
        else
        {
            return false;
        }
    }
    
    protected void placeBlock(World worldIn, IBlockState p_175811_2_, int p_175811_3_, int p_175811_4_, int p_175811_5_, StructureBoundingBox p_175811_6_)
    {
    	IBlockState iblockstate1;
    	int chance = rand.nextInt(10);
    	if (chance == 1) {
    		iblockstate1 = this.func_175847_a(p_175811_2_);
    	} else {
    		iblockstate1 = this.func_175847_a(Blocks.stonebrick.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.byMetadata(1)));
    	}
        super.setBlockState(worldIn, iblockstate1, p_175811_3_, p_175811_4_, p_175811_5_, p_175811_6_);
    }

}
