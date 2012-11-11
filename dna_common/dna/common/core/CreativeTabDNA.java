package dna_common.dna.common.core;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import dna_common.dna.common.lib.ItemIds;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class CreativeTabDNA extends CreativeTabs 
{
	public CreativeTabDNA(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return ItemIds.dnaStrand;
    }
}