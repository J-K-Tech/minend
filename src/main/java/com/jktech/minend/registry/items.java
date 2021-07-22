package com.jktech.minend.registry;

import com.jktech.minend.Initi;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class items {
//organic materials
    public static final Item RESIN = new Item(new Item.Settings().group(groups.MINEND_MATERIALS));
    public static final Item PLASTIC = new Item(new Item.Settings().group(groups.MINEND_MATERIALS).fireproof());
//inorganic materials
//tools
    public static final Item FIRE_STICKS = new Item(new Item.Settings().group(groups.MINEND_TOOLS));

//weapons
    public static final Item KNIFE = new Item(new Item.Settings().group(groups.MINEND_WEAPONS));

//loots
    //packs
    public static final Item TINY_PACK = new Item(new Item.Settings().group(groups.MINEND_LOOTS));
    public static final Item MEDIUM_PACK = new Item(new Item.Settings().group(groups.MINEND_LOOTS));
    public static final Item BIG_PACK = new Item(new Item.Settings().group(groups.MINEND_LOOTS));

    
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "resin"),RESIN);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "plastic"),PLASTIC);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "knife"),KNIFE);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "tiny_pack"),TINY_PACK);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "medium_pack"),MEDIUM_PACK);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "big_pack"),BIG_PACK);
        Registry.register(Registry.ITEM, new Identifier(Initi.MOD_ID, "fire_sticks"),FIRE_STICKS);
    }
}
