package com.javacrouse.se.lesson16Interface;

public class Mi8 extends Helicopter implements VerticalTakeoff {

    @Override
    public void fly() {
        System.out.println("Helicopter MI8");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("VerticalTakeoff MI8");
    }
}
