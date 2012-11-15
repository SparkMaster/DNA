package dna_common.dna.common.tools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemTitaniumPick extends ItemPickaxe
{

 public ItemTitaniumPick(int par1, EnumToolMaterial par2EnumToolMaterial)
 {
  super(par1, par2EnumToolMaterial);
 }
 
 public String getTextureFile()
 {
  return "/dna_resources/tools.";
 }
}