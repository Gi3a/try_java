package com.javacrouse.se.lesson4Variables;

public class References {
    String str = "Моя строка";
    String str2 = new String("Моя строка");

    Byte a;
    Short b;
    Integer c;
    Long d;
    Character z;
    Float e;
    Double f;
    Boolean g;

    public void foo(){
        new String("Моя строка");
        a.toString();
        b.intValue();
    }
}
