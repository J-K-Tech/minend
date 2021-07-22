package com.jktech.minend.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;

import java.lang.reflect.Method;
import java.util.function.Consumer;

@Mixin(LootContextTypes.class)
public class lootpacks extends LootContextTypes{
    private static final BiMap<Identifier, LootContextType> MAP = HashBiMap.create();
    public static final LootContextType LOOTPACKS = Register("lootpacks", (builder) -> {
        builder.require(LootContextParameters.ORIGIN).allow(LootContextParameters.THIS_ENTITY);
    });
    private static LootContextType Register(String name, Consumer<LootContextType.Builder> type) {
        LootContextType.Builder builder = new LootContextType.Builder();
        type.accept(builder);
        LootContextType lootContextType = builder.build();
        Identifier identifier = new Identifier(name);
        LootContextType lootContextType2 = (LootContextType)MAP.put(identifier, lootContextType);
        if (lootContextType2 != null) {
            throw new IllegalStateException("Loot table parameter set " + identifier + " is already registered");
        } else {
            return lootContextType;
        }
    }

}
