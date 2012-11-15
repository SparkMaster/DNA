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
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import dna_client.dna.client.packets.ClientPacketHandler;
import dna_common.dna.common.armors.ModArmors;
import dna_common.dna.common.block.ModBlocks;
import dna_common.dna.common.core.CommonProxyDNA;
import dna_common.dna.common.core.CreativeTabDNA;
import dna_common.dna.common.core.handlers.ConfigurationHandler;
import dna_common.dna.common.core.handlers.EntityLivingHandler;
import dna_common.dna.common.core.handlers.GuiHandler;
import dna_common.dna.common.core.handlers.RecipeHandler;
import dna_common.dna.common.core.helpers.LogHelper;
import dna_common.dna.common.core.helpers.VersionCheckTickHandler;
import dna_common.dna.common.core.helpers.VersionHelper;
import dna_common.dna.common.item.ModItems;
import dna_common.dna.common.lib.ConfigurationSettings;
import dna_common.dna.common.lib.Reference;
import dna_common.dna.common.packets.ServerPacketHandler;
import dna_common.dna.common.tools.ModTools;
import dna_common.dna.common.world.WorldgeneratorDNA;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, clientPacketHandlerSpec = @SidedPacketHandler(channels = {Reference.MOD_ID}, packetHandler = ClientPacketHandler.class), serverPacketHandlerSpec =@SidedPacketHandler(channels = {Reference.MOD_ID}, packetHandler = ServerPacketHandler.class))
public class DNA 
{
	@Instance(Reference.MOD_ID)
	public static DNA instance;
	
	private GuiHandler guiHandler = new GuiHandler();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxyDNA proxy;
	
	public static CreativeTabs tabsDNA = new CreativeTabDNA(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		// Initialize the log helper
		LogHelper.init();
		// Initialize the configuration
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		// Conduct the version check and log the result
		if (ConfigurationSettings.ENABLE_VERSION_CHECK) {
        	VersionHelper.checkVersion();
        }
    	VersionHelper.logResult();
    	// Initialize the Version Check Tick Handler (Client only)
        TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);
        
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		// Initialize the custom item rarity types
		proxy.initCustomRarityTypes();
		// Register the GUI Handler
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		// Register the EntityLiving Handler
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
		// Initialize mod blocks
		ModBlocks.init();
		// Initialize mod items
		ModItems.init();
		// Initialize mod tools
		ModTools.init();
		// Initialize mod armors
		ModArmors.init();
        // Initialize custom rendering and pre-load textures (Client only)
     	proxy.initRenderingAndTextures();
     	// Initialize mod recipes
     	RecipeHandler.loadRecipes();
     	// Initialize world gen
     	GameRegistry.registerWorldGenerator(new WorldgeneratorDNA());
	}
}
