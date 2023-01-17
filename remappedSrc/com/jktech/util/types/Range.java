package com.jktech.util.types;

import java.util.Random;

public class Range {
    public static int value1;
    public static int value2;
    public Range(int a,int b){
        value1 = a;
        value2 = b;
    }
    public static int Random(){
        Random r = new Random();
        return r.ints(1,value1,value2).findFirst().getAsInt();
    }
}
