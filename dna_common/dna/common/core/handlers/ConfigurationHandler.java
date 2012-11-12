package dna_common.dna.common.core.handlers;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import dna_common.dna.common.lib.BlockIds;
import dna_common.dna.common.lib.ConfigurationSettings;
import dna_common.dna.common.lib.ItemIds;
import dna_common.dna.common.lib.Reference;
import dna_common.dna.common.lib.Strings;
import net.minecraftforge.common.Configuration;
import static net.minecraftforge.common.Configuration.*;

public class ConfigurationHandler {

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();

            /* General Configs */
            ConfigurationSettings.ENABLE_VERSION_CHECK = configuration
            		.get(CATEGORY_GENERAL, Reference.ENABLE_VERSION_CHECK, ConfigurationSettings.ENABLE_VERSION_CHECK_DEFAULT)
            		.getBoolean(ConfigurationSettings.ENABLE_VERSION_CHECK_DEFAULT);
            ConfigurationSettings.ENABLE_SOUNDS = configuration
            		.get(CATEGORY_GENERAL, Reference.ENABLE_SOUNDS, ConfigurationSettings.ENABLE_SOUNDS_DEFAULT)
            		.getBoolean(ConfigurationSettings.ENABLE_SOUNDS_DEFAULT);
            ConfigurationSettings.ENABLE_PARTICLE_FX = configuration
            		.get(CATEGORY_GENERAL, Reference.ENABLE_PARTICLE_FX, ConfigurationSettings.ENABLE_PARTICLE_FX_DEFAULT)
            		.getBoolean(ConfigurationSettings.ENABLE_PARTICLE_FX_DEFAULT);
            
            /* Block Configs */
            ConfigurationSettings.AUTO_RESOLVE_BLOCK_IDS = configuration
            		.get(CATEGORY_BLOCK, Reference.AUTO_RESOLVE_BLOCK_IDS, ConfigurationSettings.AUTO_RESOLVE_BLOCK_IDS_DEFAULT)
            		.getBoolean(ConfigurationSettings.AUTO_RESOLVE_BLOCK_IDS_DEFAULT);
            BlockIds.dnaBlock = configuration
            		.getBlock(Strings.dnaBlock, BlockIds.dnaBlock_Default)
            		.getInt(BlockIds.dnaBlock_Default);
            BlockIds.microscope = configuration
            		.getBlock(Strings.microscope, BlockIds.microscope_Default)
            		.getInt(BlockIds.microscope_Default);
            BlockIds.lithium = configuration
            		.getBlock(Strings.LITHIUM_ORE,  BlockIds.lithium_Default)
            		.getInt(BlockIds.lithium_Default);
            BlockIds.sodium = configuration
            		.getBlock(Strings.SODIUM_ORE, BlockIds.sodium_Default)
            		.getInt(BlockIds.sodium_Default);
            BlockIds.radium = configuration
            		.getBlock(Strings.RADIUM_ORE, BlockIds.radium_Default)
            		.getInt(BlockIds.radium_Default);
            BlockIds.technetium = configuration
            		.getBlock(Strings.TECHNETIUM_ORE, BlockIds.technetium_Default)
            		.getInt(BlockIds.technetium_Default);
            BlockIds.titanium = configuration
            		.getBlock(Strings.TITANIUM_ORE, BlockIds.titanium_Default)
            		.getInt(BlockIds.titanium_Default);
            BlockIds.platinum = configuration
            		.getBlock(Strings.PLATINUM_ORE, BlockIds.platinum_Default)
            		.getInt(BlockIds.platinum_Default);
            BlockIds.mercury = configuration
            		.getBlock(Strings.MERCURY_ORE, BlockIds.mercury_Default)
            		.getInt(BlockIds.mercury_Default);
            
            /* Item Configs */
            ItemIds.dnaStrand = configuration
            		.getItem(Strings.dnaStrand, ItemIds.dnaStrand_Default)
            		.getInt(ItemIds.dnaStrand_Default);
            ItemIds.dnaCell = configuration
            		.getItem(Strings.dnaCell, ItemIds.dnaCell_Default)
            		.getInt(ItemIds.dnaCell_Default);
        }
        catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }
}