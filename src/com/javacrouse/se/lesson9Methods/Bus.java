package com.javacrouse.se.lesson9Methods;

public class Bus {
    public String model, color;
    public Engine engine;
    public Tranmission tranmission;

    public final String SERIAL_NUMBER = "S30KDSA2";
    public final int SERIAL_NUMBER_2 = 239213;

    public void go(){
        System.out.println("GO");
    }

    public void showKm(int km) {
        System.out.println(km);
    }
}
