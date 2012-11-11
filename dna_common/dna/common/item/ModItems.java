package dna_common.dna.common.item;

import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.ItemIds;

public class ModItems 
{
	public static Item dnaStrand;
	public static Item dnaCell;
	
	@Init
	public static void init()
	{
		dnaStrand = new ItemStrand(ItemIds.dnaStrand).setItemName("dnaStrand");
		dnaCell = new ItemCell(ItemIds.dnaCell).setItemName("dnaCell");
		
		LanguageRegistry.addName(dnaStrand, "DNA Strand");
		LanguageRegistry.addName(dnaCell, "DNA Cell");
	}
}
