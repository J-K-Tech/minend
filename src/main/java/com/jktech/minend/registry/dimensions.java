package com.jktech.minend.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class dimensions {
    public static final RegistryKey<DimensionOptions> AFTEREND_KEY=RegistryKey.of(Registry.DIMENSION_KEY, new Identifier("minend","afterend"));
    public static RegistryKey<World> AFTEREND_WORLD=RegistryKey.of(Registry.WORLD_KEY,Registry.DIMENSION_KEY.getValue());
    public static final RegistryKey<DimensionType> AFTEREND_TYPE=RegistryKey.of(Registry.DIMENSION_TYPE_KEY,new Identifier("minend","afterend"));

    public static void register(){

    }
}
