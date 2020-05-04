package com.javacrouse.se.lesson13Inheritance;

public class Crow extends Birds {

    public Crow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Im crow and im flying");
    }
}
