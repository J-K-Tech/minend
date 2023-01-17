package com.jktech.minend.registry;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import java.util.Arrays;
import java.util.List;

public class loots {
    //create loot
    public static ItemStack stack(Item item,int ammount){return new ItemStack(item,ammount);}
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*                                                                                                                 */
    /*-----------------------------------------------------------------------------------------------------------------*/
    //packs
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack1 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2));
    public static List<Double> chances1 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack2 = Arrays.asList(stack(Items.WHEAT_SEEDS,5),
            stack(Items.MELON_SEEDS,5),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_HOE,1),stack(Items.STONE_SHOVEL,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,7));
    public static List<Double> chances2 = Arrays.asList(80.0,80.0,8.0,8.0,8.0,8.0,40.0,40.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack3 = Arrays.asList(stack(Items.WHEAT_SEEDS,10),
            stack(Items.MELON_SEEDS,10),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_HOE,1),stack(Items.STONE_SHOVEL,1),stack(Items.STONE_SWORD,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,15));
    public static List<Double> chances3 = Arrays.asList(80.0,80.0,8.0,8.0,8.0,8.0,8.0,40.0,40.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*                                                                                                                 */
    /*-----------------------------------------------------------------------------------------------------------------*/
    //boxes
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack4 = Arrays.asList(stack(items.STONE_WAR_AXE,1));
    public static List<Double> chances4 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack5 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances5 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack6 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances6 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack7 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances7 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack8 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances8 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack9 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances9 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static List<ItemStack> stack10 = Arrays.asList(stack(Items.WHEAT_SEEDS,1),
            stack(Items.MELON_SEEDS,1),stack(Items.STONE_PICKAXE,1),
            stack(Items.STONE_AXE,1),stack(Items.MELON_SEEDS,2),
            stack(items.IRON_WAR_AXE,1));
    public static List<Double> chances10 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0,10.0);
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*                                                                                                                 */
    /*-----------------------------------------------------------------------------------------------------------------*/
    //seting
    /*-----------------------------------------------------------------------------------------------------------------*/
    public static loot l1 = new loot(stack1,chances1,100,300);
    public static loot l2 = new loot(stack2,chances2,150,350);
    public static loot l3 = new loot(stack3,chances3,200,400);
    public static loot l4 = new loot(stack4,chances4,500,800);
    public static loot l5 = new loot(stack5,chances5,600,1000);
    public static loot l6 = new loot(stack6,chances6,800,1300);
    public static loot l7 = new loot(stack7,chances7,900,1800);
    public static loot l8 = new loot(stack8,chances8,600,3000);
    public static loot l9 = new loot(stack9,chances9,1000,5000);
    public static loot l10 = new loot(stack10,chances10,2000,7000);



}
