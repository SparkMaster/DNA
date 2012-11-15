package dna_common.dna.common.tools;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.ItemIds;
import dna_common.dna.common.core.helpers.EnumHelper;
import net.minecraft.src.Item;

public class ModTools 
{
	public static Item titaniumSword;
	public static Item titaniumPick;
	
	@Init
	public static void init()
	{
		titaniumSword = new ItemTitaniumSword(ItemIds.titaniumSword, EnumHelper.titanium).setIconIndex(0).setItemName("titaniumSword");
		titaniumPick = new ItemTitaniumPick(ItemIds.titaniumPick, EnumHelper.titanium).setIconIndex(1).setItemName("titaniumPick");
		
		LanguageRegistry.addName(titaniumSword, "Titanium Sword");
		LanguageRegistry.addName(titaniumPick, "Titanium Pick");
	}
}
