package com.javacrouse.se.lesson1;

import com.javacrouse.se.lesson20Serialize.Cat;
import com.javacrouse.se.lesson20Serialize.Serializator;
import com.javacrouse.se.lesson21CollectionArrayList.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //List<Person> list = new ArrayList<>();

        //Person person1 = new Person("White");
        //Person person2 = new Person("Rabbit");

        //list.add(person1);
        //list.add(person2);




        // ------------------------------------------------------------------
        //Iterator<Person> iterator = list.iterator(); //подобие foreach

        //while (iterator.hasNext()) { // hasNext проверяет, если ли следущий элемент, если есть, то цикл продолжает работу
            //Person iterPerson = iterator.next(); // получение элемента
            //System.out.println(iterPerson);
        //}

        //for(Person person: list) { // foreach
            //list.remove(person);
        //}


        // ------------------------------------------------------------------
        //List<Person> list = new LinkedList<>();
        LinkedList<Person> list = new LinkedList<>(); // связана в виде цепочки, преыдущий и следущий prev and next, легко смещать при вводе в середину
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

}
