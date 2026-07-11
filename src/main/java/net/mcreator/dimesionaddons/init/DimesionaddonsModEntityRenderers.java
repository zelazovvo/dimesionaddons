
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimesionaddons.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dimesionaddons.client.renderer.ScorpionRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimesionaddonsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DimesionaddonsModEntities.SCORPION.get(), ScorpionRenderer::new);
	}
}
