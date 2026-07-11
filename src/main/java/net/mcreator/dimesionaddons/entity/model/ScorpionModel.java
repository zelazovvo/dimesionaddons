package net.mcreator.dimesionaddons.entity.model;

import software.bernie.geckolib.animation.AnimationState;

public class ScorpionModel extends GeoModel<ScorpionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScorpionEntity entity) {
		return ResourceLocation.parse("dimesionaddons:animations/scorpion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScorpionEntity entity) {
		return ResourceLocation.parse("dimesionaddons:geo/scorpion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScorpionEntity entity) {
		return ResourceLocation.parse("dimesionaddons:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ScorpionEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}