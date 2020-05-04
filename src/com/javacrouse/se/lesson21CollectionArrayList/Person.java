package com.javacrouse.se.lesson21CollectionArrayList;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // Для правильного оторображения данного объекта
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
