package com.jktech.minend.common.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

public interface lootevent {
    Event<lootevent>drop = EventFactory.createArrayBacked(
            lootevent.class,(listeners) -> (player,item) -> {
                for (lootevent listener : listeners){
                    ActionResult res = listener.interact(player,item);
                    if (res != ActionResult.PASS){return res;}}
            return ActionResult.PASS;}
    );
    ActionResult interact(PlayerEntity player, ItemEntity item);
}
