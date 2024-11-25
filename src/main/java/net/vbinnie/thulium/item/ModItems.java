package net.vbinnie.thulium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.Thulium;
import net.vbinnie.thulium.block.ModBlocks;

public class ModItems {
    public static final Item THULIUM_INGOT = registerItem("thulium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_THULIUM = registerItem("raw_thulium",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Thulium.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
    }

    public static void registerModItems() {
        Thulium.LOGGER.info("Registering Mod Items for " + Thulium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}