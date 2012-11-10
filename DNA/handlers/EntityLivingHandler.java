package DNA.handlers;


import DNA.helpers.ItemDropHelper;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

/**
 * EntityLivingHandler
 * 
 * Class containing all EE3 custom event related logic for EntityLiving events
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
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