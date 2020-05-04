package com.javacrouse.se.lesson14Polymorphism;

public class Crow extends Birds{

    public void fly(){
        System.out.println("flying");
    }

    @Override
    public void walk() {
        System.out.println("I Crow");
    }
}
