package com.lagdaemon.minecraft.mobgrinders.core.proxy;

import com.lagdaemon.minecraft.mobgrinders.core.util.Utils;

public class CommonProxy {

	public void init() {
		Utils.getLogger().info("CommonProxy init");
	}
	
	public void registerTileEntities() {
		Utils.getLogger().info("CommonProxy registerTileEntities");
	}
	
	// should not be called here, only on client
	public void registerRenders() {
		Utils.getLogger().info("CommonProxy registerRenders");
	}
	
	// should not be called here, only on client
	public void registerModelBakeryVariants() {
		Utils.getLogger().info("CommonProxy registerModelBakeryVariants");
	}
	
}
