package net.squareshaper.slafuelpellets.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.squareshaper.slafuelpellets.registry.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COAL_PELLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARCOAL_PELLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZE_PELLET, Models.GENERATED);
    }
}
