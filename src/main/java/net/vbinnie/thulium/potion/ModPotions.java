package net.vbinnie.thulium.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.Thulium;
import net.vbinnie.thulium.effect.ModEffects;

public class ModPotions {

    public static final Potion HYPERPOISON_POTION = registerPotion("hyperpoison_potion",
            new Potion(new StatusEffectInstance(ModEffects.HYPERPOISON, 2000, 0)));


    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(Thulium.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        Thulium.LOGGER.info("Registering Potions for " + Thulium.MOD_ID);
    }
}
