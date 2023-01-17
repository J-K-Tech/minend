package com.jktech.minend.common.extendings;

import com.jktech.util.types.Range;

import net.minecraft.enchantment.Enchantment;

public class enchantment{
    public static Range range;
    public static Enchantment ent;
    public enchantment(Range r, Enchantment e){
        ent = e;
        range = r;
    }
}
