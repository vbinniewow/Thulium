package net.vbinnie.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
    }
}
