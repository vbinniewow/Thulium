package net.vbinnie.thulium.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.Stat;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.Thulium;

public interface ModEffects {

    public static final StatusEffect HYPERPOISON = registerStatusEffect("hyperpoison",
            new HyperpoisonEffect(StatusEffectCategory.HARMFUL, -13408768).addAttributeModifier(EntityAttributes.GENERIC_LUCK, "7107DE5E-7CE8-4030-940E-514C1F160890", -.2f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Thulium.MOD_ID, name), statusEffect);
    }



    public static void registerEffects() {
        Thulium.LOGGER.info("Registering Mod Effects for " + Thulium.MOD_ID);
    }
}
