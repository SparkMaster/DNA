package DNA.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import DNA.helpers.MaterialHelper;

public class BlockDNA extends Block
{
	public BlockDNA(int id, int texture)
	{
		super(id, texture, MaterialHelper.cell);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
