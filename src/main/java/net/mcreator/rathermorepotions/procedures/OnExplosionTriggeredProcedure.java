package net.mcreator.rathermorepotions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class OnExplosionTriggeredProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double amplifier) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) (amplifier + 3), Explosion.BlockInteraction.BREAK);
	}
}
