package net.squareshaper.slafuelpellets.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.squareshaper.slafuelpellets.SLAFuelPellets;

public class ModItems {
    public static final Item COAL_PELLET = registerItem("coal_pellet",new Item(new Item.Settings()));
    public static final Item CHARCOAL_PELLET = registerItem("charcoal_pellet",new Item(new Item.Settings()));

    public static void registerModItems() {
        SLAFuelPellets.LOGGER.info("Registering mod items for " + SLAFuelPellets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->
        {
            entries.addAfter(Items.COAL, COAL_PELLET);
            entries.addAfter(Items.CHARCOAL, CHARCOAL_PELLET);
        });
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, SLAFuelPellets.id(name), item);
    }
}
