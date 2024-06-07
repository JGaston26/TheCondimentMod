package org.justin.condiment.thecondimentmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MAYO = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200),0.1f).build();
    public static final FoodProperties PEPPER = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,400),0.1f).build();
    public static final FoodProperties Tomato = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f).build();
}
