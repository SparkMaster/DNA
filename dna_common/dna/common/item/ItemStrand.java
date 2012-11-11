package dna_common.dna.common.item;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemStrand extends Item
{
	public ItemStrand(int i)
	{
		super(i);
		maxStackSize = 12;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
