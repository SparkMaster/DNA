package DNA.helpers;

import net.minecraft.src.Block;
import DNA.blocks.BlockDNA;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks 
{
	public static Block dnaBlock;
	
	@Init
	public static void init()
	{
		dnaBlock = new BlockDNA(500, 0).setBlockName("dnaBlock");
		
		GameRegistry.registerBlock(dnaBlock);
		
		LanguageRegistry.addName(dnaBlock, "DNA Block");
	}
}
