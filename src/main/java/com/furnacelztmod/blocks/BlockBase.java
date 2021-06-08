package com.furnacelztmod.blocks;

import com.furnacelztmod.Main;
import com.furnacelztmod.init.BlockInit;
import com.furnacelztmod.init.ItemInit;
import com.furnacelztmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		Block iter=this;
		iter.setRegistryName(iter.getRegistryName());
		ItemInit.ITEMS.add(new ItemBlock(iter));
	}
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
