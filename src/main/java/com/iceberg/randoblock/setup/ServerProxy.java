package com.iceberg.randoblock.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Please run only this on the client");
    }
}
