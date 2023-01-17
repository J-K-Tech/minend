package com.jktech.minend.registry;


import com.google.gson.JsonElement;

import net.minecraft.data.client.model.Model;
import net.minecraft.data.client.model.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class model{
    public static BiConsumer<Identifier, Supplier<JsonElement>> writer;
    public static final Model DOUBLESIZED;
    public static final Model TRIPLESIZED;
    public static final Model FOURFOLDSIZED;

    private static Model item(int a,String parent, TextureKey... requiredTextures) {
        String b;
        if (a==0){b = "item";}if(a==1){b="sizes";}else {b="";}
        return new Model(Optional.of(new Identifier("minend", b+"/"+ parent)), Optional.empty(), requiredTextures);
    }
    static {
    DOUBLESIZED = item(1,"doublesized", TextureKey.LAYER0);
    TRIPLESIZED = item(1,"triplesized", TextureKey.LAYER0);
    FOURFOLDSIZED = item(1,"fourfoldsized", TextureKey.LAYER0);
    }
}