package dna_common.dna.common.tools;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.ItemIds;
import dna_common.dna.common.core.helpers.EnumHelper;
import net.minecraft.src.Item;

public class ModTools 
{
	public static Item titaniumSword;
	
	@Init
	public static void init()
	{
		titaniumSword = new ItemTitaniumSword(ItemIds.titaniumSword, EnumHelper.titanium).setIconIndex(0).setItemName("titaniumSword");
		
		LanguageRegistry.addName(titaniumSword, "Titanium Sword");
	}
}
