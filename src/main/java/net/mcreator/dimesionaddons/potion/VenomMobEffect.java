
package net.mcreator.dimesionaddons.potion;

import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dimesionaddons.procedures.VenomEffectStartedappliedProcedure;
import net.mcreator.dimesionaddons.DimesionaddonsMod;

import java.util.Set;

public class VenomMobEffect extends MobEffect {
	public VenomMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10173333);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(DimesionaddonsMod.MODID, "effect.venom_0"), -8, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(DimesionaddonsMod.MODID, "effect.venom_1"), -0.09, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(DimesionaddonsMod.MODID, "effect.venom_2"), -10, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, ResourceLocation.fromNamespaceAndPath(DimesionaddonsMod.MODID, "effect.venom_3"), -0.09, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.HONEY);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		VenomEffectStartedappliedProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
