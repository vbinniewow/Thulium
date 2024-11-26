package net.vbinnie.thulium.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.vbinnie.thulium.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class DivineWoodSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.DIVINEWOOD_KEY;
    }
}
