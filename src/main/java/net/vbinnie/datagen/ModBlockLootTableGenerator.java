package net.vbinnie.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.THULIUM_BLOCK);
        addDrop(ModBlocks.RAW_THULIUM_BLOCK);


        addDrop(ModBlocks.DEEPSLATE_THULIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_THULIUM_ORE, ModItems.RAW_THULIUM));

        addDrop(ModBlocks.DIVINE_WOOD);
        addDrop(ModBlocks.DIVINE_SAPLING);
        addDrop(ModBlocks.STRIPPED_DIVINE_WOOD);
        addDrop(ModBlocks.STRIPPED_DIVINE_LOG);
        addDrop(ModBlocks.DIVINE_LOG);
        addDrop(ModBlocks.DIVINE_PLANKS);
        addDrop(ModBlocks.DIVINE_LEAVES, leavesDrops(ModBlocks.DIVINE_LEAVES, ModBlocks.DIVINE_LEAVES, 0.5f));
    }
}
