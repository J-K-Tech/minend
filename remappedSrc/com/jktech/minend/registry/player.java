package com.jktech.minend.registry;

import net.minecraft.entity.player.PlayerEntity;

public class player {
    public static boolean hasglowingitem(PlayerEntity p){
    if (items.glows(p.getItemsHand().iterator().next())){
        return true;
    }
    else{return false;}
    }
}
