package com.jktech.minend.registry;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import java.util.Arrays;
import java.util.List;

public class loots {
    //loots
    public static List<ItemStack> lpassive = Arrays.asList(new ItemStack(items.TINY_PACK,1),
            new ItemStack(items.MEDIUM_PACK,1),new ItemStack(items.BIG_PACK,1));
    public static List<Double> cpassive = Arrays.asList(70.0,35.0,15.0);

    //packs
    public static List<ItemStack> stack1 = Arrays.asList(new ItemStack(Items.WHEAT_SEEDS,1),
            new ItemStack(Items.MELON_SEEDS,1),new ItemStack(Items.STONE_PICKAXE,1),
            new ItemStack(Items.STONE_AXE,1),new ItemStack(Items.MELON_SEEDS,2));
    public static List<Double> chances1 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0);

    public static List<ItemStack> stack2 = Arrays.asList(new ItemStack(Items.WHEAT_SEEDS,5),
            new ItemStack(Items.MELON_SEEDS,5),new ItemStack(Items.STONE_PICKAXE,1),
            new ItemStack(Items.STONE_HOE,1),new ItemStack(Items.STONE_SHOVEL,1),
            new ItemStack(Items.STONE_AXE,7),new ItemStack(Items.MELON_SEEDS,7));
    public static List<Double> chances2 = Arrays.asList(80.0,80.0,8.0,8.0,8.0,8.0,40.0,40.0);

    public static List<ItemStack> stack3 = Arrays.asList(new ItemStack(Items.WHEAT_SEEDS,10),
            new ItemStack(Items.MELON_SEEDS,10),new ItemStack(Items.STONE_PICKAXE,1),
            new ItemStack(Items.STONE_HOE,1),new ItemStack(Items.STONE_SHOVEL,1),new ItemStack(Items.STONE_SWORD,1),
            new ItemStack(Items.STONE_AXE,15),new ItemStack(Items.MELON_SEEDS,15));
    public static List<Double> chances3 = Arrays.asList(80.0,80.0,8.0,8.0,8.0,8.0,8.0,40.0,40.0);


    //boxes
    public static List<ItemStack> stack4 = Arrays.asList(new ItemStack(Items.WHEAT_SEEDS,1),
            new ItemStack(Items.MELON_SEEDS,1),new ItemStack(Items.STONE_PICKAXE,1),
            new ItemStack(Items.STONE_AXE,1),new ItemStack(Items.MELON_SEEDS,2));
    public static List<Double> chances4 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0);

    public static List<ItemStack> stack5 = Arrays.asList(new ItemStack(Items.WHEAT_SEEDS,1),
            new ItemStack(Items.MELON_SEEDS,1),new ItemStack(Items.STONE_PICKAXE,1),
            new ItemStack(Items.STONE_AXE,1),new ItemStack(Items.MELON_SEEDS,2));
    public static List<Double> chances5 = Arrays.asList(80.0,80.0,15.0,15.0,40.0,40.0);

    public static loot passive = new loot(lpassive,cpassive);
    public static loot l1 = new loot(stack1,chances1,100,400);
    public static loot l2 = new loot(stack2,chances2,150,500);
    public static loot l3 = new loot(stack3,chances3,200,600);
    public static loot l4;
    public static loot l5;



}
