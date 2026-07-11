package net.mcreator.dimesionaddons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.dimesionaddons.init.DimesionaddonsModMobEffects;
import net.mcreator.dimesionaddons.entity.ScorpionEntity;
import net.mcreator.dimesionaddons.DimesionaddonsMod;

public class ScorpionOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive()) {
			if ((entity instanceof ScorpionEntity _datEntL1 && _datEntL1.getEntityData().get(ScorpionEntity.DATA_VenomUsuable)) == true) {
				if (1 <= (entity instanceof ScorpionEntity _datEntI ? _datEntI.getEntityData().get(ScorpionEntity.DATA_VenonCD) : 0)) {
					if (entity instanceof ScorpionEntity _datEntSetL)
						_datEntSetL.getEntityData().set(ScorpionEntity.DATA_VenomSFX, false);
					if (entity instanceof ScorpionEntity _datEntSetI)
						_datEntSetI.getEntityData().set(ScorpionEntity.DATA_VenonCD, (int) ((entity instanceof ScorpionEntity _datEntI ? _datEntI.getEntityData().get(ScorpionEntity.DATA_VenonCD) : 0) * 1));
				} else {
					if (entity instanceof ScorpionEntity _datEntSetL)
						_datEntSetL.getEntityData().set(ScorpionEntity.DATA_VenomUsuable, false);
				}
			} else {
				if ((entity instanceof ScorpionEntity _datEntL7 && _datEntL7.getEntityData().get(ScorpionEntity.DATA_VenomSFX)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dimesionaddons:scorpionattack")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("dimesionaddons:scorpionattack")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (entity instanceof ScorpionEntity _datEntSetL)
						_datEntSetL.getEntityData().set(ScorpionEntity.DATA_VenomSFX, true);
				}
				if (entity instanceof ScorpionEntity) {
					((ScorpionEntity) entity).setAnimation("spit");
				}
				entity.fallDistance = 0;
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(DimesionaddonsModMobEffects.VENOM, 3600, 1));
				DimesionaddonsMod.queueServerWork(100, () -> {
					if (entity instanceof ScorpionEntity _datEntSetI)
						_datEntSetI.getEntityData().set(ScorpionEntity.DATA_VenonCD, 0);
					if (entity instanceof ScorpionEntity _datEntSetL)
						_datEntSetL.getEntityData().set(ScorpionEntity.DATA_VenomUsuable, true);
				});
			}
		}
	}
}
