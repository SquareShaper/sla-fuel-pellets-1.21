package net.squareshaper.slafuelpellets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.squareshaper.slafuelpellets.registry.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter re) {
        //Coal Pellet
        offerShapelessRecipe(re, ModItems.COAL_PELLET, Items.COAL, "sla-pellets", 8);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COAL)
                .input(ModItems.COAL_PELLET,8)
                .criterion("has_coal_pellet",conditionsFromItem(ModItems.COAL_PELLET))
                .offerTo(re);

        //Charcoal Pellet
        offerShapelessRecipe(re, ModItems.CHARCOAL_PELLET, Items.CHARCOAL, "sla-pellets", 8);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHARCOAL)
                .input(ModItems.CHARCOAL_PELLET,8)
                .criterion("has_charcoal_pellet",conditionsFromItem(ModItems.CHARCOAL_PELLET))
                .offerTo(re);

        //Blaze Pellet
        offerShapelessRecipe(re, ModItems.BLAZE_PELLET, Items.BLAZE_POWDER, "sla-pellets", 6);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLAZE_POWDER)
                .input(ModItems.BLAZE_PELLET,6)
                .criterion("has_blaze_pellet",conditionsFromItem(ModItems.BLAZE_PELLET))
                .offerTo(re);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLAZE_ROD)
                .input(Items.BLAZE_POWDER,2)
                .criterion("has_blaze_powder",conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(re);
    }
}
