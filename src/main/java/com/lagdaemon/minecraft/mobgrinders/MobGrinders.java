package com.lagdaemon.minecraft.mobgrinders;

import com.lagdaemon.minecraft.mobgrinders.core.Reference;
import com.lagdaemon.minecraft.mobgrinders.core.proxy.CommonProxy;
import com.lagdaemon.minecraft.mobgrinders.core.util.Utils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MobGrinders {

	@Mod.Instance(Reference.MODID)
	public static MobGrinders instance;

	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	private void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("MobGrinders preInit");
		proxy.registerRenders();
		proxy.registerTileEntities();
	}
	
	@EventHandler
	private void init(FMLInitializationEvent event) {
		Utils.getLogger().info("MobGrinders init");
		proxy.init();
		proxy.registerModelBakeryVariants();
	}	
	
	@EventHandler
	private void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("MobGrinders postInit");
	}
	
}
