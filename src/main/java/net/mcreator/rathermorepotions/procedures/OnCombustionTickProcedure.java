package net.mcreator.rathermorepotions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.rathermorepotions.init.RatherMorePotionsModMobEffects;

public class OnCombustionTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double nx = 0;
		double ny = 0;
		double nz = 0;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RatherMorePotionsModMobEffects.MOISTURE.get()) : false)) {
			entity.setSecondsOnFire(1);
			Block f = Blocks.FIRE;
			nx = x;
			ny = y;
			nz = z;
			BlockPos steppedPos2 = new BlockPos(x, (int) Math.ceil(y), z);
			if (f.defaultBlockState().canSurvive(world, new BlockPos(steppedPos2.getX(), steppedPos2.getY(), steppedPos2.getZ()))) {
				world.setBlock(new BlockPos(steppedPos2.getX(), steppedPos2.getY(), steppedPos2.getZ()), f.defaultBlockState(), 3);
			}
		}
	}
}
