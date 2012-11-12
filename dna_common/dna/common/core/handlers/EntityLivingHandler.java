package dna_common.dna.common.core.handlers;


import dna_common.dna.common.core.helpers.ItemDropHelper;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class EntityLivingHandler {

	@ForgeSubscribe
	public void onEntityLivingUpdate(LivingUpdateEvent event) 
	{
		
	}

	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event) {
		if (event.source.getDamageType().equals("player")) {
			ItemDropHelper.dropDNAStrand((EntityPlayer)event.source.getSourceOfDamage(), event.entityLiving);
		}
	}

}