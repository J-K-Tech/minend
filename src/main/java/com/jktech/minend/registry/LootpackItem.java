package com.jktech.minend.registry;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.*;

import static com.jktech.minend.registry.items.COINS;


public class LootpackItem extends Item {
    public loot loots;

    public LootpackItem(Settings settings,loot lootss) {
        super(settings);
        this.loots = lootss;
    }
    public void setloot(loot lotss){
        this.loots = lotss;
    }
    public List<ItemStack> sortloot(PlayerEntity player){

        if (Objects.isNull(player))
            return Collections.emptyList();

        List<ItemStack> list = new ArrayList<>();
        for (int i = 0;i < loots.stacks.size();i++){
        double min = 0;
        double max = 100;
        Random r = new Random();
        double rr = min + (max - min) * r.nextDouble();
        if (rr >= (100-loots.chances.get(i))){list.add(loots.stacks.get(i));}
    }sortcoin(player);return list;}
    public void sortcoin(PlayerEntity player){
        Random r = new Random();
        player.increaseStat(COINS,loots.coins + loots.range * r.nextInt());
    }

}
