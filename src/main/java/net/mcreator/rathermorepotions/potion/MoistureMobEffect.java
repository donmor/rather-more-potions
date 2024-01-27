
package net.mcreator.rathermorepotions.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rathermorepotions.procedures.OnMoistureTickProcedure;

public class MoistureMobEffect extends MobEffect {
	public MoistureMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rather_more_potions.moisture";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OnMoistureTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
