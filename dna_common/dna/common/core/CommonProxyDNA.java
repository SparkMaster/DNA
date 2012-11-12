package dna_common.dna.common.core;

import net.minecraft.src.EnumRarity;
import net.minecraftforge.client.MinecraftForgeClient;

public class CommonProxyDNA
{
	public void initRenderingAndTextures() 
	{
		MinecraftForgeClient.preloadTexture("/dna/blocks.png");
		MinecraftForgeClient.preloadTexture("/dna/items.png");
		MinecraftForgeClient.preloadTexture("/dna/ingots.png");
	}
	
	public void initCustomRarityTypes() {}

    public EnumRarity getCustomRarityType(String customRarity) 
    {
        return null;
    }
}
