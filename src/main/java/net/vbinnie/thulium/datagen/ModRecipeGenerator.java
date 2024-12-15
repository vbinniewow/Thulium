package net.vbinnie.thulium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;
import net.vbinnie.thulium.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {

        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POISONOUS_SUBSTANCE)
                .pattern("CP")
                .pattern("RF")
                .input('C', Items.CHICKEN)
                .input('F', Items.PUFFERFISH)
                .input('R', Items.ROTTEN_FLESH)
                .input('P', Items.POISONOUS_POTATO)
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .criterion(hasItem(Items.CHICKEN), conditionsFromItem(Items.CHICKEN))
                .criterion(hasItem(Items.POISONOUS_POTATO), conditionsFromItem(Items.POISONOUS_POTATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POISONOUS_SUBSTANCE) + "_recipe"));

        offerShapelessRecipe(exporter, ModBlocks.DIVINE_PLANKS, ModBlocks.DIVINE_LOG, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.DIVINE_PLANKS, ModBlocks.STRIPPED_DIVINE_LOG, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.DIVINE_PLANKS, ModBlocks.STRIPPED_DIVINE_WOOD, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.DIVINE_PLANKS, ModBlocks.DIVINE_WOOD, "misc", 4);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.THULIUM_INGOT, RecipeCategory.MISC, ModBlocks.THULIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_THULIUM, RecipeCategory.MISC, ModBlocks.RAW_THULIUM_BLOCK);



        offerSmelting(exporter, List.of(ModItems.RAW_THULIUM, ModBlocks.DEEPSLATE_THULIUM_ORE), RecipeCategory.MISC, ModItems.THULIUM_INGOT, 0.25F, 200, "thulium_ingot" );
        offerBlasting(exporter, List.of(ModItems.RAW_THULIUM, ModBlocks.DEEPSLATE_THULIUM_ORE), RecipeCategory.MISC, ModItems.THULIUM_INGOT, 0.25F, 100, "thulium_ingot" );;

    }
}
