package dna_common.dna.common.block;

import java.util.Random;

import net.minecraft.src.BlockContainer;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import dna_common.dna.common.DNA;
import dna_common.dna.common.tile.TileDNA;

public class MicroScope extends BlockContainer {
	
	public MicroScope(int id, int texture) {
		super(id, texture, Material.iron);
		this.setCreativeTab(DNA.tabsDNA);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int i, float f, float g, float t) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(DNA.instance, 0, world, x, y, z);
		return true;
	}
	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j) {
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, i, j);
	}
	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (!(tile_entity instanceof IInventory)) {
			return;
		}
		IInventory inventory = (IInventory) tile_entity;
		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			ItemStack item = inventory.getStackInSlot(i);
			if (item != null && item.stackSize > 0) {
				float rx = rand.nextFloat() * 0.6F + 0.1F;
				float ry = rand.nextFloat() * 0.6F + 0.1F;
				float rz = rand.nextFloat() * 0.6F + 0.1F;
				EntityItem entity_item = new EntityItem(world, x + rx, y + ry,
						z + rz, new ItemStack(item.itemID, item.stackSize,
								item.getItemDamage()));
				if (item.hasTagCompound()) {
					entity_item.item.setTagCompound((NBTTagCompound) item
							.getTagCompound().copy());
				}
				float factor = 0.5F;
				entity_item.motionX = rand.nextGaussian() * factor;
				entity_item.motionY = rand.nextGaussian() * factor + 0.2F;
				entity_item.motionZ = rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entity_item);
				item.stackSize = 0;
			}
		}
	}
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileDNA();
	}
}
