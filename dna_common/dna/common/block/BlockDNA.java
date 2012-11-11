package dna_common.dna.common.block;

import dna_common.dna.common.core.helpers.MaterialHelper;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;

public class BlockDNA extends Block
{
	public BlockDNA(int id, int texture)
	{
		super(id, texture, MaterialHelper.cell);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
