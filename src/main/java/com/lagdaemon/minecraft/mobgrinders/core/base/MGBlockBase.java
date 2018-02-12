package com.lagdaemon.minecraft.mobgrinders.core.base;

import com.lagdaemon.minecraft.mobgrinders.core.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/***
 * Base class for basic blocks in MobGrinders
 * 
 * @author LagDaemon
 *
 */

public class MGBlockBase extends Block {
	public MGBlockBase(Material materialIn, String unlocalizedName, int hardness, int resistance) {
		super(materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(Reference.getResourceLocation(unlocalizedName));
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
}
