package dna_common.dna.common.block;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class MicroScope extends Block
{
	public MicroScope(int id, int texture)
	{
		super(id, texture, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
