package net.mcreator.dimesionaddons.procedures;

import net.minecraft.world.entity.Entity;

public class VenomEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSprinting(false);
	}
}
