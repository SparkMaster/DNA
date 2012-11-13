package dna_common.dna.common.core.handlers;

import net.minecraft.src.Item;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import dna_common.dna.common.block.ModBlocks;
import dna_common.dna.common.item.ModItems;
import dna_common.dna.common.tools.ModTools;

public class RecipeHandler 
{
	public static void loadRecipes()
	{
		//Items
		GameRegistry.addRecipe(new ItemStack(ModItems.dnaCell), new Object[] {" D ", "D D", " D ", 'D', ModItems.dnaStrand});
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.dnaBlock), new Object[] {"CCC", "CSC", "CCC", 'C', ModItems.dnaCell, 'S', ModItems.dnaStrand});
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.microscope), new Object[] {" II", " PI", "III", 'I', Item.ingotIron, 'P', Block.thinGlass});
		
		//Ores
		GameRegistry.addSmelting(ModBlocks.lithium.blockID, new ItemStack(ModItems.lithiumIngot), 0.7F);
		GameRegistry.addSmelting(ModBlocks.sodium.blockID, new ItemStack(ModItems.sodiumDust), 0.7F);
		GameRegistry.addSmelting(ModBlocks.radium.blockID, new ItemStack(ModItems.radiumIngot), 0.7F);
		GameRegistry.addSmelting(ModItems.radiumIngot.shiftedIndex, new ItemStack(ModItems.radiumDust), 0.7F);
		GameRegistry.addSmelting(ModBlocks.technetium.blockID, new ItemStack(ModItems.technetiumIngot), 0.7F);
		GameRegistry.addSmelting(ModBlocks.titanium.blockID, new ItemStack(ModItems.titaniumIngot), 0.7F);
		GameRegistry.addSmelting(ModItems.titaniumIngot.shiftedIndex, new ItemStack(ModItems.titaniumDust), 0.7F);
		GameRegistry.addSmelting(ModBlocks.platinum.blockID, new ItemStack(ModItems.platinumIngot), 0.7F);
		GameRegistry.addSmelting(ModItems.platinumIngot.shiftedIndex, new ItemStack(ModItems.platinumDust), 0.7F);
		GameRegistry.addSmelting(ModBlocks.mercury.blockID, new ItemStack(ModItems.mercuryIngot), 0.7F);
		GameRegistry.addSmelting(ModItems.mercuryIngot.shiftedIndex, new ItemStack(ModItems.mercuryLiquid), 0.7F);
		
		//Tools
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumSword), new Object[] {"X","X","S", 'X', ModItems.titaniumIngot, 'S', Item.stick});
	}
}
