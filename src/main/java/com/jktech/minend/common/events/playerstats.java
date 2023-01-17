package com.jktech.minend.common.events;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.item.ItemStack;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.stat.Stats;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.jktech.minend.registry.items.COINS;
import static com.jktech.minend.registry.items.COINSTACK;
import static com.jktech.minend.registry.items.coinmatrix;


@Mixin(InGameHud.class)
public class playerstats{
    public InGameHud hud = ((InGameHud)(Object)this);
    @Inject(method = "renderStatusEffectOverlay", at = @At("RETURN"))
    private void onRenderStatusEffectOverlay(CallbackInfo ci) {
        MinecraftClient client = ((client)(hud)).getclient();
        Integer a = client.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(COINS));
        ItemRenderer itemrenderer = client.getItemRenderer();itemrenderer.renderGuiItemIcon(new ItemStack(COINSTACK),5,5);
        TextRenderer fontrenderer = client.textRenderer;fontrenderer.draw(coinmatrix,a.toString(),35,10,16776960);
        }


}
