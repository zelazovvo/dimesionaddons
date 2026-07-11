
package net.mcreator.dimesionaddons.client.renderer;

public class ScorpionRenderer extends GeoEntityRenderer<ScorpionEntity> {
	public ScorpionRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ScorpionModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ScorpionEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ScorpionEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

}