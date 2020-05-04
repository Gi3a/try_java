package com.javacrouse.se.lesson14Polymorphism;

public class Ostrich extends Birds {
    public void hideHead() {
        System.out.println("Im ostrich and im hiding");
    }
    // Alt ins

    @Override
    public void walk() {
        System.out.println("E baby");
    }
}
