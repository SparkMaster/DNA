package dna_common.dna.common.block;

import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dna_common.dna.common.lib.BlockIds;

public class ModBlocks 
{
	public static Block dnaBlock;
	//public static Block microscope;
	public static Block lithium;
	public static Block sodium;
	public static Block radium;
	public static Block technetium;
	public static Block titanium;
	public static Block platinum;
	public static Block mercury;
	
	@Init
	public static void init()
	{
		dnaBlock = new BlockDNA(BlockIds.dnaBlock, 0).setBlockName("dnaBlock");
		//microscope = new MicroScope(BlockIds.microscope, 0).setBlockName("microscope");
		lithium = new Ore(BlockIds.lithium, 0).setHardness(3F).setResistance(2F).setStepSound(Block.soundStoneFootstep).setBlockName("lithium");
		sodium = new Ore(BlockIds.sodium, 0).setHardness(3F).setResistance(2F).setStepSound(Block.soundStoneFootstep).setBlockName("sodium");
		radium = new Ore(BlockIds.radium, 0).setHardness(5F).setResistance(4F).setStepSound(Block.soundPowderFootstep).setBlockName("radium");
		technetium = new Ore(BlockIds.technetium, 0).setHardness(4F).setResistance(4F).setStepSound(Block.soundStoneFootstep).setBlockName("technetium");
		titanium = new Ore(BlockIds.titanium, 0).setHardness(3F).setResistance(3F).setStepSound(Block.soundStoneFootstep).setBlockName("titanium");
		platinum = new Ore(BlockIds.platinum, 0).setHardness(5F).setResistance(3F).setStepSound(Block.soundStoneFootstep).setBlockName("platinum");
		mercury = new Ore (BlockIds.mercury, 0).setHardness(3F).setResistance(3F).setStepSound(Block.soundStoneFootstep).setBlockName("mercury");
		
		GameRegistry.registerBlock(dnaBlock);
		//GameRegistry.registerBlock(microscope);
		GameRegistry.registerBlock(lithium);
		GameRegistry.registerBlock(sodium);
		GameRegistry.registerBlock(radium);
		GameRegistry.registerBlock(technetium);
		GameRegistry.registerBlock(titanium);
		GameRegistry.registerBlock(platinum);
		GameRegistry.registerBlock(mercury);
		
		LanguageRegistry.addName(dnaBlock, "DNA Block");
		//LanguageRegistry.addName(microscope, "MicroScope");
		LanguageRegistry.addName(lithium, "Lithium Ore");
		LanguageRegistry.addName(sodium, "Sodium Ore");
		LanguageRegistry.addName(radium, "Radium Ore");
		LanguageRegistry.addName(technetium, "Technetium Ore");
		LanguageRegistry.addName(titanium, "Titanium Ore");
		LanguageRegistry.addName(platinum, "Platinum Ore");
		LanguageRegistry.addName(mercury, "Mercury Ore");
	}
}
