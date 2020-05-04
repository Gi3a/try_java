package com.javacrouse.se.lesson20Serialize;

import java.io.Serializable;

public class Cat implements Serializable { // Mark as serializable
    private String name; // Если если есть изменения, то не сработает
    // Конструктор при десериализации не используется, так как не может быть восстановлен

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
