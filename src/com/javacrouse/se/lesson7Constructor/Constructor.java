package com.javacrouse.se.lesson7Constructor;

public class Constructor {

    public static void foo() {
        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.color = "Белая";


        Flower flower2 = new Flower("Роза", "Красный");
        Flower flower3 = new Flower("Тюльпан", "Желтый");

        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower2.name + " " + flower2.color);
        System.out.println(flower3.name + " " + flower3.color);
    }
}
