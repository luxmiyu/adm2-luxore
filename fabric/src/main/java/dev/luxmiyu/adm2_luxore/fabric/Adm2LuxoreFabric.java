package dev.luxmiyu.adm2_luxore.fabric;

import net.fabricmc.api.ModInitializer;

import dev.luxmiyu.adm2_luxore.Adm2Luxore;

public final class Adm2LuxoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Adm2Luxore.init();
    }
}
