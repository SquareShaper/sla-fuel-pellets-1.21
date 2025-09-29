package net.squareshaper.slafuelpellets.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.squareshaper.slafuelpellets.SLAFuelPellets;

import java.util.function.Function;

public class ModItems {
    public static final Item COAL_PELLET = registerItem("coal_pellet", Item::new);
    public static final Item CHARCOAL_PELLET = registerItem("charcoal_pellet", Item::new);
    public static final Item BLAZE_PELLET = registerItem("blaze_pellet", Item::new);

    public static void registerModItems() {
        SLAFuelPellets.LOGGER.info("Registering mod items for " + SLAFuelPellets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->
        {
            entries.addAfter(Items.COAL, COAL_PELLET);
            entries.addAfter(Items.CHARCOAL, CHARCOAL_PELLET);
            entries.addAfter(Items.BLAZE_ROD, BLAZE_PELLET);
        });
    }

    public static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, SLAFuelPellets.id(name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, SLAFuelPellets.id(name)))));
    }
}
