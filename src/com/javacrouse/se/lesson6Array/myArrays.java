package com.javacrouse.se.lesson6Array;

public class myArrays {

    int [] array = new int[3];
    Candy [] box = new Candy[5];

    int [] array2 = {10, 3, 7};
    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy [] box2 = {candyFirst, candySecond, candyThird};
    Candy [] box3;

    public void foo(){

        for(int i = 0; i < box2.length; i++){
            System.out.println(box2[i]);
        }

    }
}
