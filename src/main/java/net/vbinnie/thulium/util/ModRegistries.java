package net.vbinnie.thulium.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.vbinnie.thulium.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammables();
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DIVINE_LOG, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DIVINE_WOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_SAPLING, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_LEAVES, 30, 60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.DIVINE_LOG, ModBlocks.STRIPPED_DIVINE_LOG);

        StrippableBlockRegistry.register(ModBlocks.DIVINE_WOOD, ModBlocks.STRIPPED_DIVINE_WOOD);
    }
}
