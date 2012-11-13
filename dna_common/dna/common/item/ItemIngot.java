package dna_common.dna.common.item;

import dna_common.dna.common.DNA;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemIngot extends Item
{
    public ItemIngot(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(DNA.tabsDNA);
    }
}