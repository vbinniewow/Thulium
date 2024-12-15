package net.vbinnie.thulium.datagen;

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

        BlockStateModelGenerator.BlockTexturePool divinePlankTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIVINE_PLANKS);
        divinePlankTexturePool.slab(ModBlocks.DIVINE_SLAB);
        divinePlankTexturePool.stairs(ModBlocks.DIVINE_STAIRS);
        divinePlankTexturePool.button(ModBlocks.DIVINE_BUTTON);
        divinePlankTexturePool.pressurePlate(ModBlocks.DIVINE_PRESSURE_PLATE);

        divinePlankTexturePool.fence(ModBlocks.DIVINE_FENCE);
        divinePlankTexturePool.fenceGate(ModBlocks.DIVINE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.DIVINE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DIVINE_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIVINE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DIVINE_SAPLING, ModBlocks.POTTED_DIVINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THULIO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEV_BLOCK2);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_THULIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.THULIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POISONOUS_SUBSTANCE, Models.GENERATED);
    }
}
