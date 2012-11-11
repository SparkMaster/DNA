package dna_client.dna.client.core;

import static dna_common.dna.common.lib.CustomItemRarity.COLOR_EPIC;
import static dna_common.dna.common.lib.CustomItemRarity.COLOR_LEGENDARY;
import static dna_common.dna.common.lib.CustomItemRarity.COLOR_NORMAL;
import static dna_common.dna.common.lib.CustomItemRarity.COLOR_RARE;
import static dna_common.dna.common.lib.CustomItemRarity.COLOR_UNCOMMON;
import static dna_common.dna.common.lib.CustomItemRarity.DISPLAY_NAME_EPIC;
import static dna_common.dna.common.lib.CustomItemRarity.DISPLAY_NAME_LEGENDARY;
import static dna_common.dna.common.lib.CustomItemRarity.DISPLAY_NAME_NORMAL;
import static dna_common.dna.common.lib.CustomItemRarity.DISPLAY_NAME_RARE;
import static dna_common.dna.common.lib.CustomItemRarity.DISPLAY_NAME_UNCOMMON;
import static dna_common.dna.common.lib.CustomItemRarity.EPIC;
import static dna_common.dna.common.lib.CustomItemRarity.LEGENDARY;
import static dna_common.dna.common.lib.CustomItemRarity.NORMAL;
import static dna_common.dna.common.lib.CustomItemRarity.RARE;
import static dna_common.dna.common.lib.CustomItemRarity.UNCOMMON;
import dna_common.dna.common.core.CommonProxyDNA;
import net.minecraft.src.EnumRarity;
import net.minecraftforge.client.EnumHelperClient;


public class ClientProxyDNA extends CommonProxyDNA
{
	@Override
	public void registerRenderThings()
	{
		
	}
	@Override
    public void initCustomRarityTypes() 
	{
        EnumHelperClient.addRarity(NORMAL, COLOR_NORMAL, DISPLAY_NAME_NORMAL);
        EnumHelperClient.addRarity(UNCOMMON, COLOR_UNCOMMON, DISPLAY_NAME_UNCOMMON);
        EnumHelperClient.addRarity(RARE, COLOR_RARE, DISPLAY_NAME_RARE);
        EnumHelperClient.addRarity(EPIC, COLOR_EPIC, DISPLAY_NAME_EPIC);
        EnumHelperClient.addRarity(LEGENDARY, COLOR_LEGENDARY, DISPLAY_NAME_LEGENDARY);
    }

    @Override
    public EnumRarity getCustomRarityType(String customRarity) 
    {
        for (EnumRarity rarity : EnumRarity.class.getEnumConstants()) {
            if (rarity.name().equals(customRarity))
                return rarity;
        }
        return EnumRarity.common;
    }
}
