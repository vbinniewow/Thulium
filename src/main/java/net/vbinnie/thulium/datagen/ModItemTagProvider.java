package net.vbinnie.thulium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.DIVINE_LOG.asItem(),
                        ModBlocks.STRIPPED_DIVINE_LOG.asItem()
                            , ModBlocks.DIVINE_WOOD.asItem()
                                , ModBlocks.STRIPPED_DIVINE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.DIVINE_WOODS)
                .add(ModBlocks.DIVINE_LOG.asItem())
                        .add(ModBlocks.DIVINE_WOOD.asItem())
                                .add(ModBlocks.STRIPPED_DIVINE_LOG.asItem())
                                        .add(ModBlocks.STRIPPED_DIVINE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.DIVINE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.DIVINE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.DIVINE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.DIVINE_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.DIVINE_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.DIVINE_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.DIVINE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.DIVINE_TRAPDOOR.asItem());
    }

}
