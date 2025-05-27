package net.squareshaper.slafuelpellets;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.util.Identifier;
import net.squareshaper.slafuelpellets.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLAFuelPellets implements ModInitializer {
	public static final String MOD_ID = "sla-fuel-pellets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Identifier id(String name){
		return Identifier.of(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.COAL_PELLET, 200);
		FuelRegistry.INSTANCE.add(ModItems.CHARCOAL_PELLET, 200);
	}
}