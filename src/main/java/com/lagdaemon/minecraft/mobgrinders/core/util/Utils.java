package com.lagdaemon.minecraft.mobgrinders.core.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lagdaemon.minecraft.mobgrinders.core.Reference;

public class Utils {

	private static Logger logger;
	private static Lang lang;
	
	
	public static Logger getLogger() {
		if (logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID); 
		}
		return logger;
	}
	
	public static Lang getLang() {
		if (lang == null) {
			lang = new Lang(Reference.MODID);
		}
		return lang;
	}
	
	
	
}
