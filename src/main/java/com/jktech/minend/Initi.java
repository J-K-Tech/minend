package com.jktech.minend;
import com.jktech.minend.registry.items;
import net.fabricmc.api.ModInitializer;

public class Initi implements ModInitializer {
    public static final String MOD_ID = "minend";
    @Override
    public void onInitialize(){items.registerItems();}


}
