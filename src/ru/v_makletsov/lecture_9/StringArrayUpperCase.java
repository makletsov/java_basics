package ru.v_makletsov.lecture_9;

public class StringArrayUpperCase {
    /* • Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в
         которых все символы заглавные
       • Для этого использовать метод класса String toUpperCase() */

    private static void convertStringArrayToUpperCase(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Скажи-ка, дядя,", "ведь не даром..."};

        for (String string : strings) {
            System.out.println(string);
        }

        convertStringArrayToUpperCase(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
