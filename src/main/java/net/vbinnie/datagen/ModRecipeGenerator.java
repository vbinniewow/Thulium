package net.vbinnie.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.THULIUM_INGOT, RecipeCategory.MISC, ModBlocks.THULIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_THULIUM, RecipeCategory.MISC, ModBlocks.RAW_THULIUM_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_THULIUM, ModBlocks.DEEPSLATE_THULIUM_ORE), RecipeCategory.MISC, ModItems.THULIUM_INGOT, 0.25F, 200, "thulium_ingot" );


    }
}
