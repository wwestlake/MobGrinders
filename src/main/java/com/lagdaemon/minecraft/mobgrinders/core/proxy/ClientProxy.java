package com.lagdaemon.minecraft.mobgrinders.core.proxy;

import com.lagdaemon.minecraft.mobgrinders.core.util.Utils;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		Utils.getLogger().info("ClientProxy init");
	}
	
	@Override
	public void registerRenders() {
		Utils.getLogger().info("ClientProxy registerRenders");
	}

	@Override
	public void registerModelBakeryVariants() {
		Utils.getLogger().info("ClientProxy registerModelBakeryVariants");
	}
	
}
