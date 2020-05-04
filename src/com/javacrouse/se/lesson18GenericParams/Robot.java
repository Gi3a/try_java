package com.javacrouse.se.lesson18GenericParams;

public class Robot <T extends Head> { // Если не написать extends, то можно засунуть даже ногу LEG

    private Body body;
    private T head; // Вместо T, будет лежать параметрм, например SmallHead OBJECT

    //public void foo() {
    //    head.  НЕ МОЖЕМ ИСПОЛЬЗОВАТЬ МЕТОДЫ ПЕРЕДАВАЕМОЙ ГОЛОВЫ
    //}

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

   // public void foo(Robot<?> obj) {
       // return
    //}
}
