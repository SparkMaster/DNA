package dna_common.dna.common.block;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import dna_common.dna.common.DNA;
import dna_common.dna.common.lib.CustomItemRarity;
import net.minecraft.src.Block;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class Ore extends Block 
{

	public Ore(int id, int texture) 
	{
		super(id, texture, Material.rock);
		this.setCreativeTab(DNA.tabsDNA);
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getCustomRarityType(int colorNormal) 
    {
        return getCustomRarityType(CustomItemRarity.COLOR_NORMAL);
    }
}
