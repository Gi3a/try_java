package com.javacrouse.se.lesson13Inheritance;

public class Ostrich extends Birds {

    public Ostrich(String name) {
        super(name);
    }

    public void hideHead() {
        System.out.println("Im ostrich and im hiding");
    }

    public void walk(String str){
        System.out.println("Walking ho-ho" + str);
    }
}
