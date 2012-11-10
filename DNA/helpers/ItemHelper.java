package DNA.helpers;

import net.minecraft.src.Item;
import DNA.items.ItemCell;
import DNA.items.ItemStrand;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper 
{
	public static Item dnaStrand;
	public static Item dnaCell;
	
	@Init
	public static void initItems()
	{
		dnaStrand = new ItemStrand(16000).setItemName("dnaStrand");
		dnaCell = new ItemCell(16001).setItemName("dnaCell");
		
		LanguageRegistry.addName(dnaStrand, "DNA Strand");
		LanguageRegistry.addName(dnaCell, "DNA Cell");
	}
}
