package com.iceberg.randoblock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ruby extends Block {

    public Ruby() {
        super(Properties.create(Material.EARTH).sound(SoundType.METAL).hardnessAndResistance(0.1f).lightValue(2));
        setRegistryName("ruby");
    }
}
