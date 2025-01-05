package net.vbinnie.thulium.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.World;

public class HyperpoisonEffect extends StatusEffect {
    protected HyperpoisonEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();


        if (!world.isClient() && entity.age % 200 == 0) {
            entity.damage(world.getDamageSources().magic(), 3.0f);
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }
}