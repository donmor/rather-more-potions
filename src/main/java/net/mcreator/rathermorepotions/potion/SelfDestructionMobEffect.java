
package net.mcreator.rathermorepotions.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SelfDestructionMobEffect extends MobEffect {
	public SelfDestructionMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.rather_more_potions.self_destruction";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
