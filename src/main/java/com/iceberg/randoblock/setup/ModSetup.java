package com.iceberg.randoblock.setup;

import com.iceberg.randoblock.blocks.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("randoblock") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ruby);
        }
    };

    public void init()
    {

    }
}
