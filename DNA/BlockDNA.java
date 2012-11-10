package DNA;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockDNA extends Block
{
	public BlockDNA(int id, int texture)
	{
		super(id, texture, DNA.cell);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
