package com.jktech.minend.registry;

import com.jktech.minend.common.extendings.jewel;

import net.minecraft.item.Item.Settings;

public class jewels {
    public static jewel TOPAZ;
    public static jewel POWERED_TOPAZ;
    public static Settings setting;
    static {
        setting = new Settings().maxCount(12).group(groups.MINEND_JEWELS);
        TOPAZ = new jewel(setting,"topaz",1);
        POWERED_TOPAZ = new jewel(setting,"topaz",2);
    }
}
