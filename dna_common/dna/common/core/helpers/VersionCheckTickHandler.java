package dna_common.dna.common.core.helpers;

import java.util.EnumSet;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import dna_common.dna.common.lib.Colours;
import dna_common.dna.common.lib.ConfigurationSettings;
import dna_common.dna.common.lib.Reference;

public class VersionCheckTickHandler implements ITickHandler {

	private static boolean initialized = false;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) { }

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		if (ConfigurationSettings.ENABLE_VERSION_CHECK) {
			if (!initialized) {
				for (TickType tickType : type) {
					if (tickType == TickType.CLIENT) {
						if (FMLClientHandler.instance().getClient().currentScreen == null) {
							initialized = true;
							if (VersionHelper.result != VersionHelper.CURRENT){ 
							    FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(Colours.VERSION_CHECK_PREFIX + "[" + Reference.MOD_NAME + "] " + VersionHelper.getResultMessage());
							}
						}
					}
				}
			}
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public String getLabel() {
		return Reference.MOD_NAME + ": " + this.getClass().getSimpleName();
	}

}