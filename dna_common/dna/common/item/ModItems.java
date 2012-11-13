package dna_common.dna.common.item;

import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.ItemIds;

public class ModItems 
{
	public static Item dnaStrand;
	public static Item dnaCell;
	public static Item lithiumIngot;
	public static Item sodiumDust;
	public static Item radiumIngot;
	public static Item radiumDust;
	public static Item technetiumIngot;
	public static Item titaniumIngot;
	public static Item titaniumDust;
	public static Item platinumIngot;
	public static Item platinumDust;
	public static Item mercuryIngot;
	public static Item mercuryLiquid;
	
	@Init
	public static void init()
	{
		dnaStrand = new ItemStrand(ItemIds.dnaStrand).setIconIndex(0).setItemName("dnaStrand");
		dnaCell = new ItemCell(ItemIds.dnaCell).setIconIndex(1).setItemName("dnaCell");
		lithiumIngot = new ItemIngot(ItemIds.lithiumIngot).setIconIndex(2).setItemName("lithiumIngot");
		sodiumDust = new ItemIngot(ItemIds.sodiumDust).setIconIndex(3).setItemName("sodiumDust");
		radiumIngot = new ItemIngot(ItemIds.radiumIngot).setIconIndex(4).setItemName("radiumIngot");
		radiumDust = new ItemIngot(ItemIds.radiumDust).setIconIndex(5).setItemName("radiumDust");
		technetiumIngot = new ItemIngot(ItemIds.technetiumIngot).setIconIndex(6).setItemName("technetiumIngot");
		titaniumIngot = new ItemIngot(ItemIds.titaniumIngot).setIconIndex(7).setItemName("titaniumIngot");
		titaniumDust = new ItemIngot(ItemIds.titaniumDust).setIconIndex(8).setItemName("titaniumDust");
		platinumIngot = new ItemIngot(ItemIds.platinumIngot).setIconIndex(9).setItemName("platinumIngot");
		platinumDust = new ItemIngot(ItemIds.platinumDust).setIconIndex(10).setItemName("platinumDust");
		mercuryIngot = new ItemIngot(ItemIds.mercuryIngot).setIconIndex(11).setItemName("mercuryIngot");
		mercuryLiquid = new ItemIngot(ItemIds.mercuryLiquid).setIconIndex(12).setItemName("mercuryLiquid");
		
		LanguageRegistry.addName(dnaStrand, "DNA Strand");
		LanguageRegistry.addName(dnaCell, "DNA Cell");
		LanguageRegistry.addName(lithiumIngot, "Lithium Ingot");
		LanguageRegistry.addName(sodiumDust, "Sodium Dust");
		LanguageRegistry.addName(radiumIngot, "Radium Ingot");
		LanguageRegistry.addName(radiumDust, "Radium Dust");
		LanguageRegistry.addName(technetiumIngot, "Technetium Ingot");
		LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(titaniumDust, "Titanium Dust");
		LanguageRegistry.addName(platinumIngot, "Platinum Ingot");
		LanguageRegistry.addName(platinumDust, "Platinum Dust");
		LanguageRegistry.addName(mercuryIngot, "Mercury Ingot");
		LanguageRegistry.addName(mercuryLiquid, "Liquid Mercury");
	}
}
