package net.mcreator.rathermorepotions.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class OnFreezingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean nw = false;
		double nx = 0;
		double ny = 0;
		double nz = 0;
		if (entity.getTicksFrozen() <= 140) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() + 5));
		}
		entity.clearFire();
		nw = world.isClientSide();
		nx = x;
		ny = y;
		nz = z;
		BlockPos steppedPos = new BlockPos(x, (int) Math.ceil(y - 1), z);
		BlockState stepped = world.getBlockState(steppedPos);
		Block replacePair[][] = {{Blocks.WATER, Blocks.FROSTED_ICE}, {Blocks.LAVA, Blocks.MAGMA_BLOCK}};
		for (int i = 0; i < replacePair.length; i++)
			if (stepped.getBlock() == replacePair[i][0]) {
				BlockState newBlock = replacePair[i][1].defaultBlockState();
				for (Map.Entry<Property<?>, Comparable<?>> entry : stepped.getValues().entrySet()) {
					Property property = newBlock.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (property != null && newBlock.getValue(property) != null)
						try {
							newBlock = newBlock.setValue(property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(steppedPos, newBlock, 3);
				break;
			}
	}
}
