package dna_common.dna.common.core.handlers;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import dna_common.dna.common.container.ContainerDNA;
import dna_common.dna.common.lib.GuiDNA;
import dna_common.dna.common.tile.TileDNA;

public class GuiHandler implements IGuiHandler{

        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
        	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                if(tile_entity instanceof TileDNA)
                {
                        return new ContainerDNA((TileDNA) tile_entity, player.inventory);
                }
                return null;
        }
        
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
        	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                if(tile_entity instanceof TileDNA)
                {       
                        return new GuiDNA(player.inventory, (TileDNA) tile_entity);
                }

        return null;
        }
}