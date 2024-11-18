package io.github.xdoxx123.example_mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class ExampleModItems {
	public static final Item EXAMPLE_ITEM = new Item(new Item.Settings());

	public static void register(ModContainer mod){
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "example_item"), EXAMPLE_ITEM);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(EXAMPLE_ITEM);
		});
	}
}
