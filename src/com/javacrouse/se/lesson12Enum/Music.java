package com.javacrouse.se.lesson12Enum;

public enum Music {
    CLASSIC(5,"classic"), ROCK(8, "rock"), POP(12, "pop");

    private int id;
    private String name;

//    Constructor of this variable i
    Music(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getI() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void foo() {
        System.out.println("id: " + getI() + " | name: " + getName());
    }
}
