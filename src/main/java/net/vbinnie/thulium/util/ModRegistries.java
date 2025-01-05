package net.vbinnie.thulium.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.potion.Potions;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;
import net.vbinnie.thulium.mixin.BrewingRecipeRegistryMixin;
import net.vbinnie.thulium.potion.ModPotions;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammables();
        registerPotionRecipes();
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DIVINE_LOG, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DIVINE_WOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_SAPLING, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_PLANKS, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_TRAPDOOR, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_DOOR, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_FENCE, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_FENCE_GATE, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_SLAB, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_PRESSURE_PLATE, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_BUTTON, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_STAIRS, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DIVINE_LEAVES, 30, 60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.DIVINE_LOG, ModBlocks.STRIPPED_DIVINE_LOG);

        StrippableBlockRegistry.register(ModBlocks.DIVINE_WOOD, ModBlocks.STRIPPED_DIVINE_WOOD);
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, ModItems.POISONOUS_SUBSTANCE, ModPotions.HYPERPOISON_POTION);
    }
}
