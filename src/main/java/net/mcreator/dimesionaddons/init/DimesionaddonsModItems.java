
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimesionaddons.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.dimesionaddons.DimesionaddonsMod;

public class DimesionaddonsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DimesionaddonsMod.MODID);
	public static final DeferredItem<Item> SCORPION_SPAWN_EGG = REGISTRY.register("scorpion_spawn_egg", () -> new DeferredSpawnEggItem(DimesionaddonsModEntities.SCORPION, -13421773, -16764160, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
