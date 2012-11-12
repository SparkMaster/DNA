package dna_common.dna.common.block;

import net.minecraft.src.Block;
import dna_common.dna.common.DNA;
import dna_common.dna.common.core.helpers.MaterialHelper;

public class BlockDNA extends Block
{
	public BlockDNA(int id, int texture)
	{
		super(id, texture, MaterialHelper.cell);
		this.setCreativeTab(DNA.tabsDNA);
	}
}
