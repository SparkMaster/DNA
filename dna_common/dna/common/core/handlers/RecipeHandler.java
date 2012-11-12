package dna_common.dna.common.core.handlers;

import net.minecraft.src.Item;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import dna_common.dna.common.block.ModBlocks;
import dna_common.dna.common.item.ModItems;

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
	}
}
