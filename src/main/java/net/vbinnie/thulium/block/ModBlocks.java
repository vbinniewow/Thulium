package net.vbinnie.thulium.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.Thulium;
import net.vbinnie.thulium.util.ModTags;
import net.vbinnie.thulium.world.tree.DivineWoodSaplingGenerator;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    // METAL/ORE/MINERAL BLOCKS BELOW

    // THULIUM BLOCKS BELOW
    public static final Block THULIUM_BLOCK = registerBlock("thulium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_THULIUM_BLOCK = registerBlock("raw_thulium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DEEPSLATE_THULIUM_ORE = registerBlock("deepslate_thulium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    // THULIUM BLOCKS ABOVE

    // METAL/ORE/MINERAL BLOCKS ABOVE

    // NATURAL BLOCKS BELOW
    public static final Block DIVINE_LEAVES = registerBlock("divine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block DIVINE_SAPLING = registerBlock("divine_sapling",
            new SaplingBlock(new DivineWoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(1f)));

    public static final Block POTTED_DIVINE_SAPLING = registerBlockWithoutBlockItem("potted_divine_sapling",
            new FlowerPotBlock(DIVINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).strength(1f)));





    public static final Block DIVINE_LOG = registerBlock("divine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block STRIPPED_DIVINE_LOG = registerBlock("stripped_divine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block DIVINE_WOOD = registerBlock("divine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block STRIPPED_DIVINE_WOOD = registerBlock("stripped_divine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));


    public static final Block DIVINE_PLANKS = registerBlock("divine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block DIVINE_STAIRS = registerBlock("divine_stairs",
            new StairsBlock(ModBlocks.DIVINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(OAK_STAIRS)));

    public static final Block DIVINE_SLAB = registerBlock("divine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));

    public static final Block DIVINE_BUTTON = registerBlock("divine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(OAK_SLAB), BlockSetType.OAK, 25, true));

    public static final Block DIVINE_PRESSURE_PLATE = registerBlock("divine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block DIVINE_FENCE = registerBlock("divine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(OAK_FENCE)));

    public static final Block DIVINE_FENCE_GATE = registerBlock("divine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(OAK_FENCE_GATE), WoodType.OAK));

    public static final Block DIVINE_DOOR = registerBlock("divine_door",
            new DoorBlock(FabricBlockSettings.copyOf(OAK_FENCE), BlockSetType.OAK));

    public static final Block DIVINE_TRAPDOOR = registerBlock("divine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(OAK_FENCE), BlockSetType.MANGROVE));

    // NATURAL BLOCKS ABOVE


    // DEV BLOCKS BELOW
    public static final Block THULIO_BLOCK = registerBlockWithoutBlockItem("thulio_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));


    public static final Block DEV_BLOCK2 = registerBlockWithoutBlockItem("dev_block2",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    // DEV BLOCKS ABOVE


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Thulium.MOD_ID, name), block);


    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Thulium.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Thulium.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Thulium.LOGGER.info("Registering ModBlocks for " + Thulium.MOD_ID);
    }
}