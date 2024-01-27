
package net.mcreator.rathermorepotions.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rathermorepotions.procedures.OnFreezingTickProcedure;

public class FreezingMobEffect extends MobEffect {
	public FreezingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434727);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rather_more_potions.freezing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OnFreezingTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
