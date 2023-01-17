package com.jktech.minend.common.extendings;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class axe extends AxeItem {

    protected axe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
