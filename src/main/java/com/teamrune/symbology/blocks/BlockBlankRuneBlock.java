package com.teamrune.symbology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.property.ExtendedBlockState;
import net.minecraftforge.common.property.IExtendedBlockState;
import net.minecraftforge.common.property.IUnlistedProperty;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teamrune.symbology.Symbology;

public class BlockBlankRuneBlock extends Block {

	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool DOWN = PropertyBool.create("down");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool WEST = PropertyBool.create("west");
	/*public static final PropertyBool NORTHWEST = PropertyBool.create("northwest");
	public static final PropertyBool SOUTHWEST = PropertyBool.create("southwest");
	public static final PropertyBool NORTHEAST = PropertyBool.create("northeast");
	public static final PropertyBool SOUTHEAST = PropertyBool.create("southeast");
	public static final PropertyBool UPWEST = PropertyBool.create("upwest");
	public static final PropertyBool DOWNWEST = PropertyBool.create("downwest");
	public static final PropertyBool UPEAST = PropertyBool.create("upeast");
	public static final PropertyBool DOWNEAST = PropertyBool.create("downeast");
	public static final PropertyBool UPNORTH = PropertyBool.create("upnorth");
	public static final PropertyBool DOWNNORTH = PropertyBool.create("downnorth");
	public static final PropertyBool UPSOUTH = PropertyBool.create("upsouth");
	public static final PropertyBool DOWNSOUTH = PropertyBool.create("downsouth");*/

	public BlockBlankRuneBlock() {
		super(Material.rock);
		setCreativeTab(Symbology.symbologyTab);
		setUnlocalizedName("blank_rune_block");
		setDefaultState(this.blockState.getBaseState()
				.withProperty(DOWN, Boolean.valueOf(false))
				.withProperty(UP, Boolean.valueOf(false))
				.withProperty(NORTH, Boolean.valueOf(false))
				.withProperty(EAST, Boolean.valueOf(false))
				.withProperty(SOUTH, Boolean.valueOf(false))
				.withProperty(WEST, Boolean.valueOf(false))
				/*.withProperty(NORTHEAST, Boolean.valueOf(false))
				.withProperty(NORTHWEST, Boolean.valueOf(false))
				.withProperty(SOUTHEAST, Boolean.valueOf(false))
				.withProperty(SOUTHWEST, Boolean.valueOf(false))
				.withProperty(UPNORTH, Boolean.valueOf(false))
				.withProperty(UPSOUTH, Boolean.valueOf(false))
				.withProperty(UPEAST, Boolean.valueOf(false))
				.withProperty(UPWEST, Boolean.valueOf(false))
				/*.withProperty(DOWNNORTH, Boolean.valueOf(false))*/
				//.withProperty(DOWNSOUTH, Boolean.valueOf(false))
				/*.withProperty(DOWNEAST, Boolean.valueOf(false))
				/*.withProperty(DOWNWEST, Boolean.valueOf(false))*/);
	}

	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.SOLID;
	}

	@Override
	public boolean isOpaqueCube() {
		return true;
	}

	@Override
	public boolean isFullCube() {
		return true;
	}

	@Override
	public int getRenderType() {
		return 3;
	}

	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	
	/*public static final IUnlistedProperty<Integer> JAI = new IUnlistedProperty<Integer>() {
		@Override
		public String getName() {
			return "justAnotherInteger";
		}
		
		@Override
		public boolean isValid(Integer value) {
			return true;
		}
		
		@Override
		public Class<Integer> getType() {
			return Integer.class;
		}
		
		@Override
		public String valueToString(Integer value){
			return value.toString();
		}
	};*/

	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn,
			BlockPos pos) {
		// return state.withProperty(DOWN,
		// Boolean.valueOf(this.canConnectTo(worldIn,
		// pos.down()))).withProperty(UP,
		// Boolean.valueOf(this.canConnectTo(worldIn,
		// pos.up()))).withProperty(NORTH,
		// Boolean.valueOf(this.canConnectTo(worldIn,
		// pos.north()))).withProperty(EAST,
		// Boolean.valueOf(this.canConnectTo(worldIn,
		// pos.east()))).withProperty(SOUTH,
		// Boolean.valueOf(this.canConnectTo(worldIn,
		// pos.south()))).withProperty(WEST,
		// Boolean.valueOf(this.canConnectTo(worldIn, pos.west())));
		return state
				.withProperty(DOWN, Boolean.valueOf(this.canConnectTo(worldIn, pos.down())))
				.withProperty(UP, Boolean.valueOf(this.canConnectTo(worldIn, pos.up())))
				.withProperty(NORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.north())))
				.withProperty(EAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.east())))
				.withProperty(SOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.south())))
				.withProperty(WEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.west())))
				/*.withProperty(NORTHEAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.north().east())))
				.withProperty(NORTHWEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.north().west())))
				.withProperty(SOUTHEAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.south().east())))
				.withProperty(SOUTHWEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.south().west())))
				.withProperty(UPNORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.up().north())))
				.withProperty(UPSOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.up().south())))
				.withProperty(UPEAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.up().east())))
				.withProperty(UPWEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.up().west())))
				/*.withProperty(DOWNNORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.down().north())))*/
				//.withProperty(DOWNSOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.down().south())))
				/*.withProperty(DOWNEAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.down().east())))
				/*.withProperty(DOWNWEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.down().west())))*/;
	}

	public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
		Block block = worldIn.getBlockState(pos).getBlock();
		if (block instanceof BlockBlankRuneBlock) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected BlockState createBlockState() {
		//return new ExtendedBlockState(this, new IProperty[]{LISTED_PROPERTIES}, new IUnlistedProperty[]{JAI});
		return new BlockState(this, new IProperty[] { NORTH, EAST, SOUTH, WEST,
				UP, DOWN/*, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST, UPNORTH,
				UPSOUTH, UPEAST, UPWEST, /*DOWNNORTH/*,*/ /*DOWNSOUTH/*, DOWNEAST/*,
				DOWNWEST*/ });
	}
	
	/*@Override
	public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos) {
		if (state instanceof IExtendedBlockState) {
			return ((IExtendedBlockState)state).withProperty(JAI, pos.getY());
		}
		return state;
	}*/
}
