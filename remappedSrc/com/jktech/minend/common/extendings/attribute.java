package com.jktech.minend.common.extendings;

import java.lang.String;

import com.jktech.util.types.Range;

public class attribute {
    public String name;
    public Range range;
    public int value;

    public attribute(String nam){name = nam;range = new Range(0,0);value = 0;}
    public attribute(String nam,Range ran){name = nam;range = ran;value = 0;}

    public attribute(String nam,int val){name = nam;value = val;range = new Range(1,1);}
    public attribute(String nam,Range ran,int val){name = nam;range = ran;value = val;}

    public attribute(Range ran,int val){name = "";range = ran;value = val;}
    public attribute(Range ran){name = "";range = ran;value = 0;}
    public attribute(int val){name = "";range = new Range(0,0);value = val;}

    public void setname(String nam){name=nam;}
    public void setrange(Range ran){range = ran;}
    public void setvalue(int val){value = val;}
    
}