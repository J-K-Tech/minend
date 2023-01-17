package com.jktech.minend.common.extendings;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;

public class jewel extends Item{
    public jewel(Settings settings){super(settings);}
    public jewel(Settings settings,String name,int level){super(settings);LEVEL.value=level;NAME.name = name;}
    public static attribute NAME = new attribute("");
    public static attribute LEVEL = new attribute("level",0);
    public List<attribute> atts = new ArrayList<attribute>();
    public void addattribute(attribute att){atts.add(att);}
}
