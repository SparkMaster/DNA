package DNA;

import net.minecraftforge.common.MinecraftForge;
import DNA.handlers.ConfigurationHandler;
import DNA.handlers.EntityLivingHandler;
import DNA.handlers.PacketHandler;
import DNA.helpers.ModBlocks;
import DNA.helpers.ModItems;
import DNA.helpers.LogHelper;
import DNA.helpers.VersionCheckTickHandler;
import DNA.helpers.VersionHelper;
import DNA.lib.ConfigurationSettings;
import DNA.lib.Reference;
import DNA.proxies.CommonProxyDNA;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.TickRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class DNA 
{
	@Instance(Reference.MOD_ID)
	public static DNA instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxyDNA proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
		LogHelper.init();
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		if (ConfigurationSettings.ENABLE_VERSION_CHECK) {
        	VersionHelper.checkVersion();
        }
    	VersionHelper.logResult();
        TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);
        
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.initCustomRarityTypes();
		proxy.registerRenderThings();
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
		ModItems.init();
		ModBlocks.init();
	}
}
