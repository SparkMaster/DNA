package DNA.helpers;

import net.minecraft.src.EntityAgeable;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;

public class ItemDropHelper {

	private static double rand;

	public static void dropDNAStrand(EntityPlayer player, EntityLiving entity) {
		if (GeneralHelper.isHostileEntity(entity)) {
			rand = Math.random();

			if (rand < 0.15d) {
				entity.dropItem(ModItems.dnaStrand.shiftedIndex, 2);
			}
		}
	}

}