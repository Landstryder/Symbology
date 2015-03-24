package com.teamrune.symbology.blocks;

import java.util.Iterator;

import scala.reflect.internal.Trees.This;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teamrune.symbology.Symbology;

public class BlockAshLog extends Block
{
    public static final PropertyEnum LOG_AXIS = PropertyEnum.create("axis", BlockAshLog.EnumAxis.class);
    
    public BlockAshLog()
    {
    	super(Material.wood);
        setCreativeTab(Symbology.symbologyTab);
        setUnlocalizedName("ash_log");
        setDefaultState(this.blockState.getBaseState().withProperty(LOG_AXIS, BlockAshLog.EnumAxis.NONE));
    }
    
    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
    	return EnumWorldBlockLayer.SOLID;
    }
    
    @Override
    public boolean isOpaqueCube() {
    	return false;
    }
    
    @Override
    public boolean isFullCube() {
    	return true;
    }
    
    @Override
    public int getRenderType() {
    	return 3;
    }
    
    public IBlockState getStateFromMeta(int meta) {
    	IBlockState iblockstate = this.getDefaultState();

        switch (meta)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockAshLog.EnumAxis.Y);
                break;
            case 1:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockAshLog.EnumAxis.X);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockAshLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockAshLog.EnumAxis.NONE);
        }

        return iblockstate;
    }
    
    public int getMetaFromState(IBlockState state) {
    	byte b0 = 0;
        int i = b0;

        switch (BlockAshLog.SwitchAxis.AXIS_LOOKUP[((BlockAshLog.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
        {
            case 1:
                i = 3;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
        }

        return i;
	}
    
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
    	System.out.println(state.getProperties().toString());
        byte b0 = 4;
        int i = b0 + 1;

        if (worldIn.isAreaLoaded(pos.add(-i, -i, -i), pos.add(i, i, i)))
        {
            Iterator iterator = BlockPos.getAllInBox(pos.add(-b0, -b0, -b0), pos.add(b0, b0, b0)).iterator();

            while (iterator.hasNext())
            {
                BlockPos blockpos1 = (BlockPos)iterator.next();
                IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

                if (iblockstate1.getBlock().isLeaves(worldIn, blockpos1))
                {
                    iblockstate1.getBlock().beginLeavesDecay(worldIn, blockpos1);
                }
            }
        }
    }
    
    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
    	System.out.println(facing.toString());
    	EnumAxis face = BlockAshLog.EnumAxis.fromFacingAxis(facing.getAxis());
    	System.out.println(face);
    	System.out.println(super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(LOG_AXIS, face).toString());
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(LOG_AXIS, face);
    }

    @Override public boolean canSustainLeaves(IBlockAccess world, BlockPos pos){ return true; }
    @Override public boolean isWood(IBlockAccess world, BlockPos pos){ return true; }
    
    protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { LOG_AXIS });
	}
    
    public static enum EnumAxis implements IStringSerializable
    {
        X("x"),
        Y("y"),
        Z("z"),
        NONE("none");
        private final String name;

        private static final String __OBFID = "CL_00002100";

        private EnumAxis(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.name;
        }

        public static BlockAshLog.EnumAxis fromFacingAxis(EnumFacing.Axis axis)
        {
            switch (BlockAshLog.SwitchAxis.AXIS_LOOKUP[axis.ordinal()])
            {
                case 1:
                    return X;
                case 2:
                    return Y;
                case 3:
                    return Z;
                default:
                    return NONE;
            }
        }

        public String getName()
        {
            return this.name;
        }
    }

    static final class SwitchAxis
        {
            static final int[] AXIS_LOOKUP = new int[BlockAshLog.EnumAxis.values().length];

            static
            {
                try
                {
                	System.out.println("Ordinal 1");
                    AXIS_LOOKUP[BlockAshLog.EnumAxis.X.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                	System.out.println("Ordinal 2");
                    AXIS_LOOKUP[BlockAshLog.EnumAxis.Y.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                	System.out.println("Ordinal 3");
                    AXIS_LOOKUP[BlockAshLog.EnumAxis.Z.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
}
