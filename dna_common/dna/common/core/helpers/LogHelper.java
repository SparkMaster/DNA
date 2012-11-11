package dna_common.dna.common.core.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import dna_common.dna.common.lib.Reference;

public class LogHelper {

	private static Logger eeLogger = Logger.getLogger(Reference.MOD_NAME);

	public static void init() {
		eeLogger.setParent(FMLLog.getLogger());
	}

	public static void log(Level logLevel, String message) {
		eeLogger.log(logLevel, message);
	}

}