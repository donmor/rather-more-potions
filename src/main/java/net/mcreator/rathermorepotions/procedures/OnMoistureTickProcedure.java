package net.mcreator.rathermorepotions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.rathermorepotions.init.RatherMorePotionsModMobEffects;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class OnMoistureTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RatherMorePotionsModMobEffects.COMBUSTION.get()) : false) || (entity.level.dimension()) == (Level.NETHER)) {
			if (world.dayTime() % 5 == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			world.addParticle(ParticleTypes.CLOUD, x, y, z, (Math.random() - 0.5), 1, (Math.random() - 0.5));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Mob _entity)
						_entity.setTarget(null);
					if (entityiterator instanceof Mob _entity)
						_entity.getNavigation().stop();
				}
			}
			BlockPos steppedPos = new BlockPos(x, (int) Math.ceil(y - 1), z);
			BlockState stepped = world.getBlockState(steppedPos);
			Block replacePair[][] = {{Blocks.LAVA, Blocks.MAGMA_BLOCK}};
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
		} else {
			BlockPos steppedPos = new BlockPos(x, (int) Math.ceil(y - 1), z);
			BlockState stepped = world.getBlockState(steppedPos);
			Block replacePair[][] = {{Blocks.LAVA, Blocks.OBSIDIAN}};
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
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RatherMorePotionsModMobEffects.COMBUSTION.get()) : false)) {
			BlockPos steppedPos = new BlockPos(x, (int) Math.ceil(y - 1), z);
			BlockState stepped = world.getBlockState(steppedPos);
			BlockPos steppedPos2 = new BlockPos(x, (int) Math.ceil(y), z);
			BlockState stepped2 = world.getBlockState(steppedPos2);
			if (stepped2.getBlock() == Blocks.FIRE) {
				world.setBlock(new BlockPos(steppedPos2.getX(), steppedPos2.getY(), steppedPos2.getZ()), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(steppedPos2.getX(), steppedPos2.getY(), steppedPos2.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(steppedPos2.getX(), steppedPos2.getY(), steppedPos2.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (stepped.getBlock() == Blocks.FARMLAND) {
				{
					int _value = 7;
					BlockPos _pos = new BlockPos(steppedPos.getX(), steppedPos.getY(), steppedPos.getZ());
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
			Block replacePair[][] = {{Blocks.SPONGE, Blocks.WET_SPONGE}, {Blocks.WHITE_CONCRETE_POWDER, Blocks.WHITE_CONCRETE}, {Blocks.ORANGE_CONCRETE_POWDER, Blocks.ORANGE_CONCRETE}, {Blocks.MAGENTA_CONCRETE_POWDER, Blocks.MAGENTA_CONCRETE},
					{Blocks.LIGHT_BLUE_CONCRETE_POWDER, Blocks.LIGHT_BLUE_CONCRETE}, {Blocks.YELLOW_CONCRETE_POWDER, Blocks.YELLOW_CONCRETE}, {Blocks.LIME_CONCRETE_POWDER, Blocks.LIME_CONCRETE}, {Blocks.PINK_CONCRETE_POWDER, Blocks.PINK_CONCRETE},
					{Blocks.GRAY_CONCRETE_POWDER, Blocks.GRAY_CONCRETE}, {Blocks.LIGHT_GRAY_CONCRETE_POWDER, Blocks.LIGHT_GRAY_CONCRETE}, {Blocks.CYAN_CONCRETE_POWDER, Blocks.CYAN_CONCRETE}, {Blocks.PURPLE_CONCRETE_POWDER, Blocks.PURPLE_CONCRETE},
					{Blocks.BLUE_CONCRETE_POWDER, Blocks.BLUE_CONCRETE}, {Blocks.BROWN_CONCRETE_POWDER, Blocks.BROWN_CONCRETE}, {Blocks.GREEN_CONCRETE_POWDER, Blocks.GREEN_CONCRETE}, {Blocks.RED_CONCRETE_POWDER, Blocks.RED_CONCRETE},
					{Blocks.BLACK_CONCRETE_POWDER, Blocks.BLACK_CONCRETE}};
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
			for (int i = 0; i < replacePair.length; i++)
				if (stepped2.getBlock() == replacePair[i][0]) {
					BlockState newBlock = replacePair[i][1].defaultBlockState();
					for (Map.Entry<Property<?>, Comparable<?>> entry : stepped2.getValues().entrySet()) {
						Property property = newBlock.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (property != null && newBlock.getValue(property) != null)
							try {
								newBlock = newBlock.setValue(property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(steppedPos2, newBlock, 3);
					break;
				}
		}
	}
}
