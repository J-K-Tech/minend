package com.jktech.minend.registry;

import com.jktech.minend.common.extendings.jewel;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
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

//jewels
    public static final jewel AMBER =  new jewel(new jewel.Settings().fireproof().maxCount(1).group(groups.MINEND_JEWELS));
    public static final jewel TOPAZ =  new jewel(new jewel.Settings().fireproof().maxCount(1).group(groups.MINEND_JEWELS));
    public static final jewel RUBY =  new jewel(new jewel.Settings().fireproof().maxCount(1).group(groups.MINEND_JEWELS));
    public static final jewel SAPPHIRE =  new jewel(new jewel.Settings().fireproof().maxCount(1).group(groups.MINEND_JEWELS));

//blocks

//tools
    public static final Item FIRE_STICKS = new FlintAndSteelItem((new Item.Settings()).maxDamage(1).group(groups.MINEND_TOOLS));

//weapons
    //ordinary
    public static final Item KNIFE = new Item(new Item.Settings().group(groups.MINEND_TOOLS));
    public static final waraxe MACHETE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Machete",1,3,4);



    //common
    public static final waraxe STONE_WAR_AXE = new waraxe( new Item.Settings().group(groups.MINEND_WEAPONS),"Stone War Axe",3,8,2);
    public static final waraxe GOLD_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Gold War Axe",2,7,2);
    public static final waraxe IRON_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Iron War Axe",5,10,2);
    public static final waraxe DIAMOND_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Diamond War Axe",7,12,2);
    
    public static final waraxe STONE_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Stone Warhammer",4,6,3);
    public static final waraxe GOLD_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Gold Warhammer",3,5,3);
    public static final waraxe IRON_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Iron Warhammer",6,8,3);
    public static final waraxe DIAMOND_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Diamond Warhammer",8,10,3);


    //uncommon
    public static final waraxe STONE_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Stone War Poleaxe",2,10,1);
    public static final waraxe GOLD_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Gold War Poleaxe",1,9,1);
    public static final waraxe IRON_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Iron War Poleaxe",4,12,1);
    public static final waraxe DIAMOND_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Diamond War Poleaxe",6,14,1);

    public static final waraxe STONE_HEAVY_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Stone Heavy Poleaxe",10,15,1);
    public static final waraxe GOLD_HEAVY_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Gold Heavy Poleaxe",10,20,1);
    public static final waraxe IRON_HEAVY_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Iron Heavy Poleaxe",13,20,1);
    public static final waraxe DIAMOND_HEAVY_WAR_POLEAXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Diamond Heavy Poleaxe",15,25,1);


    //rare
    public static final waraxe DIAMOND_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Diamond Heavy warhammer",10,15,1);
    public static final waraxe STONE_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Stone Heavy Warhammer",10,15,1);
    public static final waraxe GOLD_HEAVY_WARHAMMER = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Gold Heavy Warhammer",10,15,1);
    public static final waraxe IRON_HEAVY_WAR_AXE = new waraxe(new Item.Settings().group(groups.MINEND_WEAPONS),"Iron Heavy Waraxe",10,15,1);

//loots
    //packs
    public static Item.Settings packsetting = new Item.Settings().group(groups.MINEND_LOOTS);
    public static final LootpackItem TINY_PACK = new LootpackItem(packsetting,loots.l1);
    public static final LootpackItem MEDIUM_PACK = new LootpackItem(packsetting,loots.l2);
    public static final LootpackItem BIG_PACK = new LootpackItem(packsetting,loots.l3);
    public static final LootpackItem BOX_1 = new LootpackItem(packsetting,loots.l4);
    public static final LootpackItem BOX_2 = new LootpackItem(packsetting,loots.l5);
    public static final LootpackItem BOX_3 = new LootpackItem(packsetting,loots.l5);
    public static final LootpackItem BOX_4 = new LootpackItem(packsetting,loots.l5);
    public static final LootpackItem BOX_5 = new LootpackItem(packsetting,loots.l5);
    public static final LootpackItem BOX_6 = new LootpackItem(packsetting,loots.l5);
    public static final LootpackItem BOX_7 = new LootpackItem(packsetting,loots.l5);





    //other
    public static final Identifier COINS = new Identifier("minend", "coins");
    public static final MatrixStack coinmatrix = new MatrixStack();
    public static final Item COINSTACK = new Item(new Item.Settings());

//UI
    public static void registerItems(){

        Registry.register(CUSTOM_STAT, "coins", COINS);
        Stats.CUSTOM.getOrCreateStat(COINS, StatFormatter.DEFAULT);
        Registry.register(Registry.ITEM, new Identifier("minend", "amber"), AMBER);
        Registry.register(Registry.ITEM, new Identifier("minend", "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier("minend", "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier("minend", "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier("minend", "coinstack") ,COINSTACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "fire_sticks"), FIRE_STICKS);
        Registry.register(Registry.ITEM, new Identifier("minend", "resin"), RESIN);
        Registry.register(Registry.ITEM, new Identifier("minend", "plastic") ,PLASTIC);
        Registry.register(Registry.ITEM, new Identifier("minend", "knife"),KNIFE);
        Registry.register(Registry.ITEM, new Identifier("minend", "tiny_pack"),TINY_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "medium_pack"), MEDIUM_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "big_pack"),BIG_PACK);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_1"),BOX_1);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_2"), BOX_2);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_3"), BOX_3);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_4"), BOX_4);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_5"), BOX_5);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_6"), BOX_6);
        Registry.register(Registry.ITEM, new Identifier("minend", "box_7"), BOX_7);
        Registry.register(Registry.ITEM, new Identifier("minend", "machete"),MACHETE);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_war_axe"),STONE_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_war_axe"),IRON_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_war_axe"),GOLD_WAR_AXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_war_axe"),DIAMOND_WAR_AXE);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_warhammer"),STONE_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_warhammer"),IRON_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_warhammer"),GOLD_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_warhammer"),DIAMOND_WARHAMMER);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_war_poleaxe"),STONE_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_war_poleaxe"),GOLD_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_war_poleaxe"),IRON_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_war_poleaxe"),DIAMOND_WAR_POLEAXE);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_heavy_warhammer"),STONE_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_heavy_warhammer"),IRON_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_heavy_warhammer"),GOLD_HEAVY_WARHAMMER);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_heavy_warhammer"),DIAMOND_HEAVY_WARHAMMER);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_heavy_war_axe"),IRON_HEAVY_WAR_AXE);
        
        Registry.register(Registry.ITEM, new Identifier("minend", "gold_heavy_war_poleaxe"),GOLD_HEAVY_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "diamond_heavy_war_poleaxe"),DIAMOND_HEAVY_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "stone_heavy_war_poleaxe"),STONE_HEAVY_WAR_POLEAXE);
        Registry.register(Registry.ITEM, new Identifier("minend", "iron_heavy_war_poleaxe"),IRON_HEAVY_WAR_POLEAXE);
    }
}
