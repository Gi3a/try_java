package com.javacrouse.se.lesson20Serialize;

import java.io.*;

public class Serializator { // Запись объекта на файл
    public boolean serialization(Cat cat) {
        boolean flag = false;
        File file = new File("D:/cat.data");
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if ( fos != null ) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Cat deserialization() throws InvalidObjectException { // Получение объекта из файла
        File file = new File("D:/cat.data");
        ObjectInputStream ois = null;


        try {
            FileInputStream fis = new FileInputStream(file);

            if ( fis != null ) {
                ois = new ObjectInputStream(fis);
                Cat cat = (Cat) ois.readObject(); // рид обджект возвращает объект, мы его преобразуем к типу Кот и присваеиваем коту
                return cat;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail"); // Выводим ошибку вверх, при вызове
    }
}
