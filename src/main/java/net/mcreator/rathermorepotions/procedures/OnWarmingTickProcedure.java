package net.mcreator.rathermorepotions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class OnWarmingTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(0);
		if (entity instanceof SnowGolem && world.dayTime() % 30 == 0) {
			entity.hurt(DamageSource.MAGIC, 1);
		}
	}
}
