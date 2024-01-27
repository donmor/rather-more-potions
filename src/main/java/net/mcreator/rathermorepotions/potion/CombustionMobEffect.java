
package net.mcreator.rathermorepotions.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rathermorepotions.procedures.OnCombustionTickProcedure;

public class CombustionMobEffect extends MobEffect {
	public CombustionMobEffect() {
		super(MobEffectCategory.HARMFUL, -3381760);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rather_more_potions.combustion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OnCombustionTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
