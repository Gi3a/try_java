package com.javacrouse.se.lesson19ErrorExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {

    private ABC abc = new ABC();

    public void foo() throws FileNotFoundException {
        //System.out.println(1/0);
        //int array [] = {1,2,3}; array[5] = 3;

        try {
            abc.show();
           // System.out.println(1/0);
            // Можно много методов перебирать, но как только выйдет ошибка, он пректатиься дальше выполнять
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }

        FileInputStream fileInputStream = new FileInputStream("");
    }
}
