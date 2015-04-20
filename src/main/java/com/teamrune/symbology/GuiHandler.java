package com.teamrune.symbology;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	@Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		//System.out.println("This occurrs (client)" + id);
		/*if(id == 0) {
			TileEntity tileEntity = world.getTileEntity(x, y, z);
			if(tileEntity instanceof TileEntitySifter){
				return new ContainerSifter(player.inventory, (TileEntitySifter) tileEntity);
			}
		}*/
		return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		//System.out.println("This occurrs (server)" + id);
    	/*if(id == 0) {
			TileEntity tileEntity = world.getTileEntity(x, y, z);
			if(tileEntity instanceof TileEntitySifter){
				return new GuiContainerSifter(player.inventory, (TileEntitySifter) tileEntity);
			}
    	}*/
		return null;
    }

}