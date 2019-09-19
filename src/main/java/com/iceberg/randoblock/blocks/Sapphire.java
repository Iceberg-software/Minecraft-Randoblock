package com.iceberg.randoblock.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Sapphire extends Block {

    public Sapphire() {
        super(Properties.create(Material.EARTH).sound(SoundType.GLASS).hardnessAndResistance(2.0f).harvestTool(ToolType.PICKAXE));
        setRegistryName("sapphire");
    }
}
