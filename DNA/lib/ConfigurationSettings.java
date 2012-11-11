package DNA.lib;

public class ConfigurationSettings {

    /* 
     * General configuration settings
     */
    // Whether or not automatic block id resolution for EE3 is turned on or off
    public static boolean AUTO_RESOLVE_BLOCK_IDS;
    public static final boolean AUTO_RESOLVE_BLOCK_IDS_DEFAULT = false;
    
    // Whether or not EE3 sounds are enabled
    public static boolean ENABLE_SOUNDS;
    public static final boolean ENABLE_SOUNDS_DEFAULT = true;
    
    // Whether or not EE3 particle fx are enabled
    public static boolean ENABLE_PARTICLE_FX;
    public static final boolean ENABLE_PARTICLE_FX_DEFAULT = true;
    
    // Whether or not EE3 will do a version check when loaded
    public static boolean ENABLE_VERSION_CHECK;
    public static final boolean ENABLE_VERSION_CHECK_DEFAULT = true;
}