
package net.mcreator.rathermorepotions.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rathermorepotions.procedures.OnWarmingTickProcedure;

public class WarmingMobEffect extends MobEffect {
	public WarmingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rather_more_potions.warming";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OnWarmingTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
