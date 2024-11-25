package net.vbinnie.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.MADE_OF_THULIUM)
                .add(ModBlocks.RAW_THULIUM_BLOCK,
                        ModBlocks.THULIUM_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.TEST_BLOCKS)
                .add(ModBlocks.THULIO_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.THULIUM_BLOCK,
                        ModBlocks.RAW_THULIUM_BLOCK,
                            ModBlocks.DEEPSLATE_THULIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.THULIUM_BLOCK,
                        ModBlocks.RAW_THULIUM_BLOCK,
                            ModBlocks.DEEPSLATE_THULIUM_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DIVINE_LOG,
                        ModBlocks.STRIPPED_DIVINE_LOG,
                            ModBlocks.DIVINE_WOOD,
                                ModBlocks.STRIPPED_DIVINE_WOOD);

    }
}
