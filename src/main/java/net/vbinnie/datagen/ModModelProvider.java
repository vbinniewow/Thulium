package net.vbinnie.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THULIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_THULIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THULIUM_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.DIVINE_LOG).log(ModBlocks.DIVINE_LOG).wood(ModBlocks.DIVINE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DIVINE_LOG).log(ModBlocks.STRIPPED_DIVINE_LOG).wood(ModBlocks.STRIPPED_DIVINE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIVINE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIVINE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.DIVINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THULIO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_THULIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.THULIUM_INGOT, Models.GENERATED);
    }
}
