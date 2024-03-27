package net.ghost.extendedmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(5).fast()
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 50.0f).build();
}
