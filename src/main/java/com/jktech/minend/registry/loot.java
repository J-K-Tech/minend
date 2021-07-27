package com.jktech.minend.registry;

import net.minecraft.item.ItemStack;

import java.util.List;

public class loot {
    public List<ItemStack> stacks;
    public List<Double> chances;
    public int coins = 0;
    public int range = 0;
    public loot(List<ItemStack> stack,List<Double> chance){
        this.stacks = stack;
        this.chances = chance;
    }
    public loot(List<ItemStack> stack,List<Double> chance,int value){
        this.stacks = stack;
        this.chances = chance;
        this.coins = value;
    }
    public loot(List<ItemStack> stack,List<Double> chance,int value,int range){
        this.stacks = stack;
        this.chances = chance;
        this.coins = value;
        this.range = range;
    }
    public void add(ItemStack stack){
        try {
            this.chances.remove(this.stacks.indexOf(stack));
            this.stacks.remove(stack);
        } catch (Exception e) {
            System.out.println("!!!  [[ WOW!!! ]]  not a valid itemstack to remove from loot!!!");
        }
    }
    public void setcoins(int value){this.coins = value;}
    public void setcoins(int value,int range){this.coins = value;this.range = range;}
}