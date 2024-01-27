package net.mcreator.rathermorepotions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.rathermorepotions.init.RatherMorePotionsModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnEntityDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double level = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get()) : false) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z,
						(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get()) ? _livEnt.getEffect(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get()).getAmplifier() : 0) + 3),
						Explosion.BlockInteraction.BREAK);
		}
	}
}
