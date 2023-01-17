package com.jktech.minend.common.extendings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jktech.minend.registry.items;
import com.jktech.util.types.Range;

public class waraxe extends Item{
    public static attribute NAME = new attribute("");
    public static attribute DAMAGE = new attribute("damage",new Range(0,0),0);
    public static attribute SPEED = new attribute("speed",new Range(0,0),0);
    public static attribute LEVEL = new attribute("level",0);
	public waraxe(Settings settings) {
		super(settings);
	}
    public static boolean glows(ItemStack i){
        if (i.isOf(items.IRON_HEAVY_WAR_POLEAXE)){return true;}
        else {return false;}
    }
}