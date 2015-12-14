package com.teamrune.symbology.world.gen;

import java.util.Random;

import com.teamrune.symbology.Symbology;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.IPlantable;

public class WorldGenSymbologyTrees extends WorldGenAbstractTree
{
    /** The minimum height of a generated tree. */
    private final int minTreeHeight;
    /** True if this tree should grow Vines. */
    private final boolean vinesGrow;
    /** The metadata value of the wood to use in tree generation. */
    private final int metaWood;
    /** The metadata value of the leaves to use in tree generation. */
    private final int metaLeaves;

    public WorldGenSymbologyTrees(boolean p_i2027_1_)
    {
        this(p_i2027_1_, 6, 0, 0, false);
    }

    public WorldGenSymbologyTrees(boolean p_i2028_1_, int p_i2028_2_, int p_i2028_3_, int p_i2028_4_, boolean p_i2028_5_)
    {
        super(p_i2028_1_);
        this.minTreeHeight = p_i2028_2_;
        this.metaWood = p_i2028_3_;
        this.metaLeaves = p_i2028_4_;
        this.vinesGrow = p_i2028_5_;
    }
    
    private void setBlock(World worldIn, BlockPos pos, Block block, int meta) {
    	this.setBlockAndNotifyAdequately(worldIn, pos, block.getStateFromMeta(meta));
    }
    
    private void setBlockByPropertyBool(World world, BlockPos pos, Block block, PropertyBool prop)
    {
        this.setBlockAndNotifyAdequately(world, pos, block.getDefaultState().withProperty(prop, Boolean.valueOf(true)));
    }
    
    private void setBlockCocoa(World world, int i, BlockPos pos, EnumFacing face)
    {
        this.setBlockAndNotifyAdequately(world, pos, Blocks.cocoa.getDefaultState().withProperty(BlockCocoa.AGE, Integer.valueOf(i)).withProperty(BlockCocoa.FACING, face));
    }

    public boolean generate(World worldIn, Random p_180709_2_, BlockPos p_180709_3_)
    {
        int i = p_180709_2_.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if (pos.getY() >= 1 && pos.getY() + i + 1 <= 256)
        {
            byte b0;
            int l;

            for (int j = pos.getY(); j <= pos.getY() + 1 + i; ++j)
            {
                b0 = 1;

                if (j == pos.getY())
                {
                    b0 = 0;
                }

                if (j >= pos.getY() + 1 + i - 2)
                {
                    b0 = 2;
                }

                for (int k = pos.getX() - b0; k <= pos.getX() + b0 && flag; ++k)
                {
                    for (l = pos.getZ() - b0; l <= pos.getZ() + b0 && flag; ++l)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!this.isReplaceable(worldIn, new BlockPos(k, j, l)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = pos.down();
                Block block1 = worldIn.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, (IPlantable) Symbology.ash_sapling);

                if (isSoil && pos.getY() < 256 - i - 1)
                {
                    block1.onPlantGrow(worldIn, down, pos);
                    b0 = 3;
                    byte b1 = 0;
                    int i1;
                    int j1;
                    int k1;
                    int l1;
                    BlockPos blockpos1;

                    for (l = pos.getY() - b0 + i; l <= pos.getY() + i; ++l)
                    {
                        i1 = l - (pos.getY() + i);
                        j1 = b1 + 1 - i1 / 2;

                        for (k1 = pos.getX() - j1; k1 <= pos.getX() + j1; ++k1)
                        {
                            l1 = k1 - pos.getX();

                            for (int i2 = pos.getZ() - j1; i2 <= pos.getZ() + j1; ++i2)
                            {
                                int j2 = i2 - pos.getZ();

                                if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i1 != 0)
                                {
                                    blockpos1 = new BlockPos(k1, l, i2);
                                    Block block = worldIn.getBlockState(blockpos1).getBlock();

                                    if (block.isAir(worldIn, blockpos1) || block.isLeaves(worldIn, blockpos1) || block.getMaterial() == Material.vine)
                                    {
                                        this.setBlock(worldIn, blockpos1, Symbology.ash_leaves, this.metaLeaves);
                                    }
                                }
                            }
                        }
                    }

                    for (l = 0; l < i; ++l)
                    {
                        BlockPos upN = pos.up(l);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN) || block2.isLeaves(worldIn, upN) || block2.getMaterial() == Material.vine)
                        {
                            this.setBlock(worldIn, pos.up(l), Symbology.ash_log, this.metaWood);

                            if (this.vinesGrow && l > 0)
                            {
                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(pos.add(-1, l, 0)))
                                {
                                    this.setBlockByPropertyBool(worldIn, pos.add(-1, l, 0), Blocks.vine, BlockVine.EAST);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(pos.add(1, l, 0)))
                                {
                                    this.setBlockByPropertyBool(worldIn, pos.add(1, l, 0), Blocks.vine, BlockVine.WEST);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(pos.add(0, l, -1)))
                                {
                                    this.setBlockByPropertyBool(worldIn, pos.add(0, l, -1), Blocks.vine, BlockVine.SOUTH);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(pos.add(0, l, 1)))
                                {
                                    this.setBlockByPropertyBool(worldIn, pos.add(0, l, 1), Blocks.vine, BlockVine.NORTH);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (l = pos.getY() - 3 + i; l <= pos.getY() + i; ++l)
                        {
                            i1 = l - (pos.getY() + i);
                            j1 = 2 - i1 / 2;

                            for (k1 = pos.getX() - j1; k1 <= pos.getX() + j1; ++k1)
                            {
                                for (l1 = pos.getZ() - j1; l1 <= pos.getZ() + j1; ++l1)
                                {
                                    BlockPos blockpos3 = new BlockPos(k1, l, l1);

                                    if (worldIn.getBlockState(blockpos3).getBlock().isLeaves(worldIn, blockpos3))
                                    {
                                        BlockPos blockpos4 = blockpos3.west();
                                        blockpos1 = blockpos3.east();
                                        BlockPos blockpos5 = blockpos3.north();
                                        BlockPos blockpos2 = blockpos3.south();

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos4).getBlock().isAir(worldIn, blockpos4))
                                        {
                                            this.func_175923_a(worldIn, blockpos4, BlockVine.EAST);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos1).getBlock().isAir(worldIn, blockpos1))
                                        {
                                            this.func_175923_a(worldIn, blockpos1, BlockVine.WEST);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos5).getBlock().isAir(worldIn, blockpos5))
                                        {
                                            this.func_175923_a(worldIn, blockpos5, BlockVine.SOUTH);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos2).getBlock().isAir(worldIn, blockpos2))
                                        {
                                            this.func_175923_a(worldIn, blockpos2, BlockVine.NORTH);
                                        }
                                    }
                                }
                            }
                        }

                        if (rand.nextInt(5) == 0 && i > 5)
                        {
                            for (l = 0; l < 2; ++l)
                            {
                                for (i1 = 0; i1 < 4; ++i1)
                                {
                                    if (rand.nextInt(4 - l) == 0)
                                    {
                                        j1 = rand.nextInt(3);
                                        EnumFacing enumfacing = EnumFacing.getHorizontal(i1).getOpposite();
                                        this.setBlockCocoa(worldIn, rand.nextInt(3), pos.add(enumfacing.getFrontOffsetX(), i - 5 + i1, enumfacing.getFrontOffsetZ()), enumfacing);
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    private void func_175923_a(World worldIn, BlockPos pos, PropertyBool prop)
    {
        this.setBlockByPropertyBool(worldIn, pos, Blocks.vine, prop);
        int j = 4;

        for (pos = pos.down(); worldIn.getBlockState(pos).getBlock().isAir(worldIn, pos) && j > 0; --j)
        {
            this.setBlockByPropertyBool(worldIn, pos, Blocks.vine, prop);
            pos = pos.down();
        }
    }
}