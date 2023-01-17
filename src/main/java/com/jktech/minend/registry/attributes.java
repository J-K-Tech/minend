package com.jktech.minend.registry;



import com.jktech.minend.common.extendings.attribute;
import com.jktech.util.types.Range;

public interface attributes {
    public static attribute NAME = new attribute("");
    public static attribute DAMAGE = new attribute("damage",new Range(0,0));
    public static attribute POWER = new attribute("power",new Range(0,0),0);
    public static attribute MANA = new attribute("mana usage",0);
    public static attribute SOCKETS = new attribute("sockets",0);
    public static attribute KNOCKBACK = new attribute("knockback",0);
    public static attribute LEVEL = new attribute("level",0);
}
