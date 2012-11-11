package dna_common.dna.common.item;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemCell extends Item
{
	public ItemCell(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
