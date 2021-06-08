package com.furnacelztmod.init;

import java.util.ArrayList;
import java.util.List;

import com.furnacelztmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS=new ArrayList<Block>();
	
	public static final Block DECRAFTING_TABLE=new BlockBase("decrafting_table", Material.ROCK);
}
