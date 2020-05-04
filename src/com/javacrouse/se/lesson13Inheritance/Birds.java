package com.javacrouse.se.lesson13Inheritance;

public class Birds {
    private String name;

    public Birds(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Walking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
