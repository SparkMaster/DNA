package dna_common.dna.common.item;

import net.minecraft.src.Item;
import dna_common.dna.common.DNA;

public class ItemStrand extends Item
{
	public ItemStrand(int i)
	{
		super(i);
		maxStackSize = 12;
		this.setCreativeTab(DNA.tabsDNA);
	}
}
