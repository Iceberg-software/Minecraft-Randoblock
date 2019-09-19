package com.iceberg.randoblock.items;

import com.iceberg.randoblock.Main;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class RubySword extends Item {
    public RubySword() {
        super(new Item.Properties().maxStackSize(1).group(Main.setup.itemGroup).defaultMaxDamage(3000));
        setRegistryName("rubysword");
    }
}
