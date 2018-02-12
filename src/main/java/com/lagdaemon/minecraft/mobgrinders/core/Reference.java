package com.lagdaemon.minecraft.mobgrinders.core;

import net.minecraft.util.ResourceLocation;

public class Reference {

	public static final String MODID = "mobgrinders";
	public static final String NAME = "Mob Grinders";
	public static final String VERSION = "0.0.1";
	public static final String AUTHOR = "LagDaemon (Bill Westlake)";
	public static final String AUTHOR_EMAIL = "wwestlake@lagdaemon.com";
	
	public static final String SERVER_PROXY_CLASS = "com.lagdaemon.minecraft.mobgrinders.core.proxy.CommonProxy";
	public static final String CLIENT_PROXY_CLASS = "com.lagdaemon.minecraft.mobgrinders.core.proxy.ClientProxy";
	
	public static ResourceLocation getResourceLocation(String unlocalizedName) {
		return new ResourceLocation(MODID, unlocalizedName);
	}
	
	
}
