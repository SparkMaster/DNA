package dna_common.dna.common.item;

import net.minecraft.src.Item;
import dna_common.dna.common.DNA;

public class ItemCell extends Item
{
	public ItemCell(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(DNA.tabsDNA);
	}
}
