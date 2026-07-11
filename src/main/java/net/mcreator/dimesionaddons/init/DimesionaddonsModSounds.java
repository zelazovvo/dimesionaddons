
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimesionaddons.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.dimesionaddons.DimesionaddonsMod;

public class DimesionaddonsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DimesionaddonsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SCORPIONATTACK = REGISTRY.register("scorpionattack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dimesionaddons", "scorpionattack")));
}
