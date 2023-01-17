package com.jktech.minend.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class groups{
    public static final ItemGroup MINEND_MATERIALS = FabricItemGroupBuilder.build(
            new Identifier("minend", "materials"),
            () -> new ItemStack(items.RESIN)
    );
    public static final ItemGroup MINEND_WEAPONS = FabricItemGroupBuilder.build(
            new Identifier("minend", "weapons"),
            () -> new ItemStack(Items.IRON_SWORD)
    );
    public static final ItemGroup MINEND_LOOTS = FabricItemGroupBuilder.build(
            new Identifier("minend", "loots"),
            () -> new ItemStack(items.TINY_PACK)
    );
    public static final ItemGroup MINEND_TOOLS = FabricItemGroupBuilder.build(
            new Identifier("minend", "tools"),
            () -> new ItemStack(Items.IRON_HOE)
    );
    public static final ItemGroup MINEND_JEWELS = FabricItemGroupBuilder.build(
        new Identifier("minend", "tools"),
        () -> new ItemStack(items.TOPAZ)
    );
}
