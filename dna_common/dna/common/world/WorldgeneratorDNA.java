package dna_common.dna.common.world;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import dna_common.dna.common.block.ModBlocks;

public class WorldgeneratorDNA implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }
	}
	
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{  
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(60);
		int Zcoord = blockZ + random.nextInt(16);
		  
		(new WorldGenMinable(ModBlocks.lithium.blockID, 14)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.sodium.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.radium.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.technetium.blockID, 7)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.titanium.blockID, 9)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.platinum.blockID, 9)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(ModBlocks.mercury.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}
	 
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(60);
		int Zcoord = blockZ + random.nextInt(16);
		  
		(new WorldGenMinableNether(ModBlocks.radium.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinableNether(ModBlocks.mercury.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}
}
