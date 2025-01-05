package net.vbinnie.thulium.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.effect.HyperpoisonEffect;
import net.vbinnie.thulium.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(InGameHud.class)
public abstract class InGameHudMixin {
	@Unique
	private static final Identifier HYPERPOISON_HEARTS = new Identifier("thulium", "textures/gui/hyperpoison_hearts.png");

	@Inject(method = "drawHeart", at = @At("HEAD"), cancellable = true)
	private void thulium$drawCustomHeart(DrawContext context, InGameHud.HeartType type, int x, int y, int v, boolean blinking, boolean halfHeart, CallbackInfo ci) {
		if (!blinking && type == InGameHud.HeartType.NORMAL && MinecraftClient.getInstance().cameraEntity instanceof PlayerEntity player && (player.hasStatusEffect(ModEffects.HYPERPOISON))) {
			Identifier textureId;
			if (player.hasStatusEffect(ModEffects.HYPERPOISON)) {
				textureId = HYPERPOISON_HEARTS;
			} else {
				return;
			}
			context.drawTexture(textureId, x, y, halfHeart ? 9 : 0, v, 9, 9);
			ci.cancel();
		}
	}
}