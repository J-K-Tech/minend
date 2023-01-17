package com.jktech.util.types;

import java.util.Random;

public class Range {
    public int value1;
    public int value2;
    public Range(int a,int b){
        value1 = a;
        value2 = b;
    }
    public int random(){
        Random r = new Random();
        return r.ints(1,value1,value2).findFirst().getAsInt();
    }
}
