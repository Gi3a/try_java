package com.javacrouse.se.lesson10Static;

public class StaticVariablesAndMethods {
    public static int variable;
    public int variable2;

//    static = {
//            variable = foo(),
//    }

    public static int foo() {
        System.out.println(variable);
        return 1;
    }

    public static void show() {
        System.out.println("No");
    }
}
