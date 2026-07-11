
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimesionaddons.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.dimesionaddons.potion.VenomMobEffect;
import net.mcreator.dimesionaddons.DimesionaddonsMod;

public class DimesionaddonsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, DimesionaddonsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> VENOM = REGISTRY.register("venom", () -> new VenomMobEffect());
}
