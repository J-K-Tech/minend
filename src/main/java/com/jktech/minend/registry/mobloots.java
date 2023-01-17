package com.jktech.minend.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.loot.entry.LootTableEntry;

public class mobloots {
    public static final Identifier passiveloot = new Identifier("minend","entities/passive");
    public static boolean check(String two,Identifier id){
        if (new Identifier("minecraft", "entities/"+two).equals(id)){return true;}else{return false;}
    }

    public static void regloot(){
    LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, ide, fabricLootSupplierBuilder, lootTableSetter) -> {
        if (check("sheep",ide) || check("cow",ide) || check("chicken",ide) || check("horse",ide) || check("pig",ide)) {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .withEntry(LootTableEntry.builder(passiveloot).build());
    
            fabricLootSupplierBuilder.withPool(poolBuilder.build());
        }
    });}
}
