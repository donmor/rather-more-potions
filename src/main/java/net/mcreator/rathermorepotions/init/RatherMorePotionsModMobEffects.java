
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rathermorepotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.rathermorepotions.potion.WarmingMobEffect;
import net.mcreator.rathermorepotions.potion.ShockMobEffect;
import net.mcreator.rathermorepotions.potion.SelfDestructionMobEffect;
import net.mcreator.rathermorepotions.potion.MoistureMobEffect;
import net.mcreator.rathermorepotions.potion.FreezingMobEffect;
import net.mcreator.rathermorepotions.potion.ExplosionMobEffect;
import net.mcreator.rathermorepotions.potion.CombustionMobEffect;
import net.mcreator.rathermorepotions.potion.AnnihilationMobEffect;
import net.mcreator.rathermorepotions.RatherMorePotionsMod;

public class RatherMorePotionsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RatherMorePotionsMod.MODID);
	public static final RegistryObject<MobEffect> EXPLOSION = REGISTRY.register("explosion", () -> new ExplosionMobEffect());
	public static final RegistryObject<MobEffect> SHOCK = REGISTRY.register("shock", () -> new ShockMobEffect());
	public static final RegistryObject<MobEffect> ANNIHILATION = REGISTRY.register("annihilation", () -> new AnnihilationMobEffect());
	public static final RegistryObject<MobEffect> WARMING = REGISTRY.register("warming", () -> new WarmingMobEffect());
	public static final RegistryObject<MobEffect> FREEZING = REGISTRY.register("freezing", () -> new FreezingMobEffect());
	public static final RegistryObject<MobEffect> MOISTURE = REGISTRY.register("moisture", () -> new MoistureMobEffect());
	public static final RegistryObject<MobEffect> COMBUSTION = REGISTRY.register("combustion", () -> new CombustionMobEffect());
	public static final RegistryObject<MobEffect> SELF_DESTRUCTION = REGISTRY.register("self_destruction", () -> new SelfDestructionMobEffect());
}
