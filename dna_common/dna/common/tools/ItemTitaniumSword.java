package dna_common.dna.common.tools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class ItemTitaniumSword extends ItemSword
{
	public ItemTitaniumSword(int itemID, EnumToolMaterial toolMaterial)
	{
		super(itemID, toolMaterial);
	}
	public String getTextureFile()
	{
		return "/dna_resources/tools.png";
	}
}