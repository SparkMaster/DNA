package dna_common.dna.common;

import net.minecraft.src.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
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
import dna_common.dna.common.block.ModBlocks;
import dna_common.dna.common.core.CommonProxyDNA;
import dna_common.dna.common.core.CreativeTabDNA;
import dna_common.dna.common.core.handlers.ConfigurationHandler;
import dna_common.dna.common.core.handlers.EntityLivingHandler;
import dna_common.dna.common.core.handlers.PacketHandler;
import dna_common.dna.common.core.helpers.LogHelper;
import dna_common.dna.common.core.helpers.VersionCheckTickHandler;
import dna_common.dna.common.core.helpers.VersionHelper;
import dna_common.dna.common.item.ModItems;
import dna_common.dna.common.lib.ConfigurationSettings;
import dna_common.dna.common.lib.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class DNA 
{
	@Instance(Reference.MOD_ID)
	public static DNA instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxyDNA proxy;
	
	public static CreativeTabs tabsDNA = new CreativeTabDNA(CreativeTabs.getNextID(), Reference.MOD_ID);
	
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
