package com.teamrune.symbology.world.gen.village;

import java.util.List;
import java.util.Random;

import com.teamrune.symbology.Symbology;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;

public class ComponentAltar extends StructureVillagePieces.House1 {
	
	private int averageGroundLevel = -1;
	
	public ComponentAltar() {}

    public ComponentAltar(StructureVillagePieces.Start start, int p_i45571_2_, Random rand, StructureBoundingBox box, EnumFacing face)
    {
        super(start, p_i45571_2_, rand, box, face);
        this.coordBaseMode = face;
        this.boundingBox = box;
    }

    public static ComponentAltar buildComponent(StructureVillagePieces.Start start, List l, Random rand, int x, int y, int z, EnumFacing face, int weight)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_175897_a(x, y, z, 0, 0, 0, 10, 7, 10, face);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(l, structureboundingbox) == null ? new ComponentAltar(start, weight, rand, structureboundingbox, face) : null;
    }

    /**
     * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes
     * Mineshafts at the end, it adds Fences...
     */
    public boolean addComponentParts(World worldIn, Random rand, StructureBoundingBox box)
    {
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
        			this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), k, 0, l, box);
        		} else if(ran <= 34 && ran >= 10) {
        			this.func_175811_a(worldIn, Blocks.gravel.getDefaultState(), k, 0, l, box);
        		} else {
        			this.func_175811_a(worldIn, Blocks.mossy_cobblestone.getDefaultState(), k, 0, l, box);
        		}
        	}
        }
        
        //Fire Arch
        this.func_175804_a(worldIn, box, 3, 2, 0, 3, 4, 0, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 7, 2, 0, 7, 4, 0, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 4, 4, 0, box);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 6, 4, 0, box);
		
		//Air Arch
        this.func_175804_a(worldIn, box, 10, 2, 3, 10, 4, 3, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 10, 2, 7, 10, 4, 7, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 4, box);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 10, 4, 6, box);
		

		//Water Arch
        this.func_175804_a(worldIn, box, 3, 2, 10, 3, 4, 10, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 7, 2, 10, 7, 4, 10, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 4, 4, 10, box);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 6, 4, 10, box);
		

		//Earth Arch
        this.func_175804_a(worldIn, box, 0, 2, 3, 0, 4, 3, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 0, 2, 7, 0, 4, 7, Symbology.blank_rune_block.getDefaultState(), Symbology.blank_rune_block.getDefaultState(), false);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 4, box);
		this.func_175811_a(worldIn, Symbology.blank_rune_block.getDefaultState(), 0, 4, 6, box);
		
		//Hole
		this.func_175804_a(worldIn, box, 3, -1, 3, 8, -5, 8, Blocks.mossy_cobblestone.getDefaultState(), Blocks.mossy_cobblestone.getDefaultState(), false);
		this.func_175804_a(worldIn, box, 4, -1, 4, 7, -4, 7, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), false);
		
		int chance;
		//Chanced
		for (k = 0; k < 21; k++) {
			chance = rand.nextInt(10);
			//Fire
			if (k == 0 && chance == 1) this.func_175811_a(worldIn, Symbology.fire_rune_block.getDefaultState(), 5, 4, 0, box);
			if (k == 1 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 3, 1, 0, box);
			if (k == 2 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 7, 1, 0, box);
			
			//Air
			if (k == 3 && chance == 1) this.func_175811_a(worldIn, Symbology.air_rune_block.getDefaultState(), 10, 4, 5, box);
			if (k == 4 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 10, 1, 3, box);
			if (k == 5 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 10, 1, 7, box);
			
			//Water
			if (k == 6 && chance == 1) this.func_175811_a(worldIn, Symbology.water_rune_block.getDefaultState(), 5, 4, 10, box);
			if (k == 7 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 3, 1, 10, box);
			if (k == 8 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 7, 1, 10, box);
			
			//Earth
			if (k == 9 && chance == 1) this.func_175811_a(worldIn, Symbology.earth_rune_block.getDefaultState(), 0, 4, 5, box);
			if (k == 10 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 0, 1, 3, box);
			if (k == 11 && chance == 1) this.func_175811_a(worldIn, Symbology.magic_rune_block.getDefaultState(), 0, 1, 7, box);
			
			//Targets
			if (k == 12 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 5, 1, 2, box);
			if (k == 13 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 7, 1, 3, box);
			if (k == 14 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 8, 1, 5, box);
			if (k == 15 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 7, 1, 7, box);
			if (k == 16 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 5, 1, 8, box);
			if (k == 17 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 3, 1, 7, box);
			if (k == 18 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 2, 1, 5, box);
			if (k == 19 && chance == 1) this.func_175811_a(worldIn, Symbology.target_rune_block.getDefaultState(), 3, 1, 3, box);
			if (k == 20 && chance == 1) this.func_175811_a(worldIn, Symbology.crafting_rune_block.getDefaultState(), 5, 1, 5, box);
		}
		
        /*this.func_175804_a(worldIn, box, 0, 6, 1, 8, 6, 4, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 0, 7, 2, 8, 7, 3, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        int i = this.getMetadataWithOffset(Blocks.oak_stairs, 3);
        int j = this.getMetadataWithOffset(Blocks.oak_stairs, 2);

        for (k = -1; k <= 2; ++k)
        {
            for (l = 0; l <= 8; ++l)
            {
                this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(i), l, 6 + k, k, box);
                this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(j), l, 6 + k, 5 - k, box);
            }
        }

        this.func_175804_a(worldIn, box, 0, 1, 0, 0, 1, 5, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 1, 1, 5, 8, 1, 5, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 8, 1, 0, 8, 1, 4, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 2, 1, 0, 7, 1, 0, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 0, 2, 0, 0, 4, 0, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 0, 2, 5, 0, 4, 5, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 8, 2, 5, 8, 4, 5, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 8, 2, 0, 8, 4, 0, Blocks.diamond_block.getDefaultState(), Blocks.diamond_block.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 0, 2, 1, 0, 4, 4, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 1, 2, 5, 7, 4, 5, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 8, 2, 1, 8, 4, 4, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 1, 2, 0, 7, 4, 0, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 4, 2, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 5, 2, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 6, 2, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 4, 3, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 5, 3, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 6, 3, 0, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 0, 2, 2, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 0, 2, 3, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 0, 3, 2, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 0, 3, 3, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 8, 2, 2, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 8, 2, 3, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 8, 3, 2, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 8, 3, 3, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 2, 2, 5, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 3, 2, 5, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 5, 2, 5, box);
        this.func_175811_a(worldIn, Blocks.glass_pane.getDefaultState(), 6, 2, 5, box);
        this.func_175804_a(worldIn, box, 1, 4, 1, 7, 4, 1, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 1, 4, 4, 7, 4, 4, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
        this.func_175804_a(worldIn, box, 1, 3, 4, 7, 3, 4, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), false);
        this.func_175811_a(worldIn, Blocks.planks.getDefaultState(), 7, 1, 4, box);
        this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, 0)), 7, 1, 3, box);
        k = this.getMetadataWithOffset(Blocks.oak_stairs, 3);
        this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(k), 6, 1, 4, box);
        this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(k), 5, 1, 4, box);
        this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(k), 4, 1, 4, box);
        this.func_175811_a(worldIn, Blocks.oak_stairs.getStateFromMeta(k), 3, 1, 4, box);
        this.func_175811_a(worldIn, Blocks.oak_fence.getDefaultState(), 6, 1, 3, box);
        this.func_175811_a(worldIn, Blocks.wooden_pressure_plate.getDefaultState(), 6, 2, 3, box);
        this.func_175811_a(worldIn, Blocks.oak_fence.getDefaultState(), 4, 1, 3, box);
        this.func_175811_a(worldIn, Blocks.wooden_pressure_plate.getDefaultState(), 4, 2, 3, box);
        this.func_175811_a(worldIn, Blocks.crafting_table.getDefaultState(), 7, 1, 1, box);
        this.func_175811_a(worldIn, Blocks.air.getDefaultState(), 1, 1, 0, box);
        this.func_175811_a(worldIn, Blocks.air.getDefaultState(), 1, 2, 0, box);
        this.func_175810_a(worldIn, box, rand, 1, 1, 0, EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, 1)));

        for (l = 0; l < 6; ++l)
        {
            for (int i1 = 0; i1 < 9; ++i1)
            {
                this.clearCurrentPositionBlocksUpwards(worldIn, i1, 9, l, box);
                this.func_175808_b(worldIn, Blocks.diamond_block.getDefaultState(), i1, -1, l, box);
            }
        }

        this.spawnVillagers(worldIn, box, 2, 1, 2, 1);*/
        return true;
    }

    protected int func_180779_c(int p_180779_1_, int p_180779_2_)
    {
        return 1;
    }

}
