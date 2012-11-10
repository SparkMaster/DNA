package DNA;

import net.minecraftforge.common.MinecraftForge;
import DNA.handlers.EntityLivingHandler;
import DNA.helpers.BlockHelper;
import DNA.helpers.ItemHelper;
import DNA.proxies.CommonProxyDNA;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Spark_DNA", name = "DNA", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DNA 
{
	@SidedProxy(clientSide = "DNA.proxies.ClientProxyDNA", serverSide = "DNA.proxies.CommonProxyDNA")
	public static CommonProxyDNA proxy;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
		ItemHelper.initItems();
		BlockHelper.initBlocks();
	}
}
