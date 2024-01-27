
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rathermorepotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.rathermorepotions.RatherMorePotionsMod;

public class RatherMorePotionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, RatherMorePotionsMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_EXPLOSION_2 = REGISTRY.register("potion_of_explosion_2", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.EXPLOSION.get(), 1, 1, false, true)));
	public static final RegistryObject<Potion> POTION_OF_EXPLOSION = REGISTRY.register("potion_of_explosion", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.EXPLOSION.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_SHOCK = REGISTRY.register("potion_of_shock", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.SHOCK.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_ANNIHILATION = REGISTRY.register("potion_of_annihilation", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.ANNIHILATION.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_WARMING = REGISTRY.register("potion_of_warming", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.WARMING.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_WARMING_L = REGISTRY.register("potion_of_warming_l", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.WARMING.get(), 9600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_FREEZING = REGISTRY.register("potion_of_freezing", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.FREEZING.get(), 900, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_FREEZING_L = REGISTRY.register("potion_of_freezing_l", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.FREEZING.get(), 1800, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_MOISTURE = REGISTRY.register("potion_of_moisture", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.MOISTURE.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_MOISTURE_L = REGISTRY.register("potion_of_moisture_l", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.MOISTURE.get(), 9600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_COMBUSTION = REGISTRY.register("potion_of_combustion", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.COMBUSTION.get(), 900, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_COMBUSTION_L = REGISTRY.register("potion_of_combustion_l", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.COMBUSTION.get(), 1800, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_SELF_DESTRUCTION = REGISTRY.register("potion_of_self_destruction", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get(), 1800, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_SELF_DESTRUCTION_2 = REGISTRY.register("potion_of_self_destruction_2", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get(), 900, 1, false, true)));
	public static final RegistryObject<Potion> POTION_OF_SELF_DESTRUCTION_L = REGISTRY.register("potion_of_self_destruction_l", () -> new Potion(new MobEffectInstance(RatherMorePotionsModMobEffects.SELF_DESTRUCTION.get(), 4800, 0, false, true)));
}
