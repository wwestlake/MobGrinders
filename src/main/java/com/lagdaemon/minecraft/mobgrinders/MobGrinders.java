package com.lagdaemon.minecraft.mobgrinders;

import com.lagdaemon.minecraft.mobgrinders.core.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MobGrinders {

	@EventHandler
	private void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	private void init(FMLInitializationEvent event) {
	}	
	
	@EventHandler
	private void postInit(FMLPostInitializationEvent event) {
	}
	
}
