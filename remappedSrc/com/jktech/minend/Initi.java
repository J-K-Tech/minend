package com.jktech.minend;
import com.jktech.minend.registry.items;
import com.jktech.minend.registry.mobloots;

import net.fabricmc.api.ModInitializer;

public class Initi implements ModInitializer {
    public static final String MOD_ID = "minend";
    @Override
    public void onInitialize(){items.registerItems();mobloots.regloot();}


}
