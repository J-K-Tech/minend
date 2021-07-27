package com.jktech.minend.registry;

import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.client.util.math.MatrixStack;
import static net.minecraft.util.registry.Registry.CUSTOM_STAT;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;


public class items {
//organic materials
    public static final Item RESIN = new Item(new Item.Settings().group(groups.MINEND_MATERIALS));
    public static final Item PLASTIC = new Item(new Item.Settings().group(groups.MINEND_MATERIALS).fireproof());
//inorganic materials
//tools
    public static final Item FIRE_STICKS = new FlintAndSteelItem((new Item.Settings()).maxDamage(1).group(groups.MINEND_TOOLS));

//weapons
    public static final Item KNIFE = new Item(new Item.Settings().group(groups.MINEND_WEAPONS));

//loots
    //packs
    public static Item.Settings packsetting = new Item.Settings().group(groups.MINEND_LOOTS);
    public static final LootpackItem TINY_PACK = new LootpackItem(packsetting,loots.l1);
    public static final LootpackItem MEDIUM_PACK = new LootpackItem(packsetting,loots.l2);
    public static final LootpackItem BIG_PACK = new LootpackItem(packsetting,loots.l3);
    public static final Identifier COINS = new Identifier("minend", "coins");
    public static final MatrixStack coinmatrix = new MatrixStack();
    public static final Item COINSTACK = new Item(new Item.Settings());
    
    public static void registerItems(){
        
        Registry.register(CUSTOM_STAT, "coins", COINS);
        Stats.CUSTOM.getOrCreateStat(COINS, StatFormatter.DEFAULT);
        Registry.register(Registry.ITEM, new Identifier("minend", "coinstack") ,COINSTACK);
        Registry.register(Registry.ITEM, new Identifier("minend","fire_sticks"), FIRE_STICKS);
        Registry.register(Registry.ITEM, new Identifier("minend", "resin"), RESIN);
        Registry.register(Registry.ITEM, new Identifier("minend", "plastic") ,PLASTIC);
        Registry.register(Registry.ITEM, new Identifier("minend", "knife"),KNIFE);
        Registry.register(Registry.ITEM, new Identifier("minend", "tiny_pack"),TINY_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "medium_pack"),MEDIUM_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "big_pack"),BIG_PACK);
    }
}
