package DNA;

import net.minecraft.src.Block;
import net.minecraft.src.MapColor;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Spark_DNA", name = "DNA", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DNA 
{
	@SidedProxy(clientSide = "DNA.client.ClientProxyDNA", serverSide = "DNA.CommonProxyDNA")
	public static CommonProxyDNA proxy;
	
	public static Block dnaBlock;
	
	public static final Material cell = new Material(MapColor.grassColor);
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		
		dnaBlock = new BlockDNA(500, 0).setBlockName("dnaBlock");
		
		GameRegistry.registerBlock(dnaBlock);
		
		LanguageRegistry.addName(dnaBlock, "DNA Block");
	}
}
