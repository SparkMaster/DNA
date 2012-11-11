package dna_common.dna.common.block;

import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.BlockIds;

public class ModBlocks 
{
	public static Block dnaBlock;
	public static Block microscope;
	
	@Init
	public static void init()
	{
		dnaBlock = new BlockDNA(BlockIds.dnaBlock, 0).setBlockName("dnaBlock");
		microscope = new MicroScope(BlockIds.microscope, 0).setBlockName("microscope");
		
		GameRegistry.registerBlock(dnaBlock);
		GameRegistry.registerBlock(microscope);
		
		LanguageRegistry.addName(dnaBlock, "DNA Block");
		LanguageRegistry.addName(microscope, "MicroScope");
	}
}
