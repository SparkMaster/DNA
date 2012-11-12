package dna_common.dna.common.lib;

public class Reference 
{
	/* General Mod related constants */
	public static final String MOD_ID = "Science";
    public static final String MOD_NAME = "Sci-Craft";
    public static final String VERSION = "0.0.4";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final String SERVER_PROXY_CLASS = "dna_common.dna.common.core.CommonProxyDNA";
    public static final String CLIENT_PROXY_CLASS = "dna_client.dna.client.core.ClientProxyDNA";
    
    /* Configuration related constants */
    public static final String ENABLE_VERSION_CHECK = "enable_version_check";
    public static final String ENABLE_SOUNDS = "enable_sounds";
    public static final String ENABLE_PARTICLE_FX = "enable_particle_fx";
    public static final String AUTO_RESOLVE_BLOCK_IDS = "auto_resolve_block_ids";
    
    /* Texture related constants */
    public static final String SPRITE_SHEET_LOCATION = "/dna/sprites/";
    public static final String ITEM_SPRITE_SHEET = "dna_items.png";
    public static final String BLOCK_SPRITE_SHEET = "dna_blocks.png";
    public static final String GUI_SHEET_LOCATION = "/dna/gui/";
    public static final String MICROSCOPE_TEXTURE_SHEET = "microscope.png";
    
    /* General Tile Entity related constants */
    public static final String TE_GEN_OWNER_NBT_TAG_LABEL = "owner";
    public static final String TE_GEN_STATE_NBT_TAG_LABEL = "state";
    public static final String TE_GEN_DIRECTION_NBT_TAG_LABEL = "direction";
}