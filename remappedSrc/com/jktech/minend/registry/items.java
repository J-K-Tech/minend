package com.jktech.minend.registry;

import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.client.util.math.MatrixStack;
import static net.minecraft.util.registry.Registry.CUSTOM_STAT;

import com.jktech.minend.common.extendings.waraxe;

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
    //ordinary
    public static final Item KNIFE = new Item(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe SHARPWOODENAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    //common
    public static final waraxe DIAMOND_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe STONE_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe GOLD_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe IRON_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe IRON_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe DIAMOND_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe STONE_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe GOLD_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe IRON_HEAVY_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe IRON_HEAVY_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final Item MACHETE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe SHARPIRONAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe IRON_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe STONE_WAR_AXE = new waraxe( new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe STONE_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe DIAMOND_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe DIAMOND_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
//loots
    //packs
    public static Item.Settings packsetting = new Item.Settings().group(groups.MINEND_LOOTS);
    public static final LootpackItem TINY_PACK = new LootpackItem(packsetting,loots.l1);
    public static final LootpackItem MEDIUM_PACK = new LootpackItem(packsetting,loots.l2);
    public static final LootpackItem BIG_PACK = new LootpackItem(packsetting,loots.l3);
    public static final Identifier COINS = new Identifier("minend", "coins");
    public static final MatrixStack coinmatrix = new MatrixStack();
    public static final Item COINSTACK = new waraxe(new Item.Settings());
    public static final waraxe GOLD_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    public static final waraxe GOLD_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS));
    
    public static boolean glows(ItemStack i){if(waraxe.glows(i)){return true;}else{return false;}}

    public static void registerItems(){
        Registry.register(CUSTOM_STAT, "coins", COINS);
        Stats.CUSTOM.getOrCreateStat(COINS, StatFormatter.DEFAULT);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_war_axe"),DIAMOND_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_war_poleaxe"),DIAMOND_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_war_axe"),GOLD_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_war_poleaxe"),GOLD_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_war_axe"),STONE_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_war_poleaxe"),STONE_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "coinstack") ,COINSTACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "fire_sticks"), FIRE_STICKS);
        Registry.register(Registry.ITEM, new Identifier("minend", "resin"), RESIN);
        Registry.register(Registry.ITEM, new Identifier("minend", "plastic") ,PLASTIC);
        Registry.register(Registry.ITEM, new Identifier("minend", "knife"),KNIFE);
        Registry.register(Registry.ITEM, new Identifier("minend", "tiny_pack"),TINY_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "medium_pack"), MEDIUM_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "big_pack"),BIG_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "machete"),MACHETE);
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_warhammer"),STONE_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_warhammer"),IRON_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_warhammer"),DIAMOND_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_warhammer"),GOLD_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_war_axe"),IRON_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_war_poleaxe"),IRON_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_heavy_warhammer"),DIAMOND_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_heavy_warhammer"),STONE_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_heavy_warhammer"),GOLD_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_heavy_war_axe"),IRON_HEAVY_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_heavy_war_poleaxe"),IRON_HEAVY_WAR_POLEAXE);
    }
}
