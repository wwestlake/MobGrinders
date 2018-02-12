package com.lagdaemon.minecraft.mobgrinders.blocks;

import com.lagdaemon.minecraft.mobgrinders.core.base.MGBlockBase;
import com.lagdaemon.minecraft.mobgrinders.core.enums.WorldEnum.WorldType;
import com.lagdaemon.minecraft.mobgrinders.core.interfaces.INaming;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockMobEssenceOre extends MGBlockBase implements INaming {

	public static final PropertyEnum WORLD_TYPE = PropertyEnum.create("type", WorldType.class);
	
	public BlockMobEssenceOre(Material material, String unlocalizedName, int hardness, int resistance) {
		super(material, unlocalizedName, hardness, resistance);
		this.setDefaultState(this.blockState.getBaseState().withProperty(WORLD_TYPE, WorldType.OVERWORLD)); // Default state
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
		for (int i = 0; i < WorldType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { WORLD_TYPE });
	}

	@Override
	public String getNameFromItemState(ItemStack stack) {
		return WorldType.values()[stack.getItemDamage()].getName();
	}
	
}
