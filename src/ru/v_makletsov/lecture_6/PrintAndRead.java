package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class PrintAndRead {
    /* • Написать функцию, которая объединяет в себе две операции: вывод пользователю приглашения для ввода в консоль и чтение int’а с консоли
       • Функция должна принимать строку и возвращать прочитанное число
       • Из функции main несколько раз вызвать данную функцию с разными значениями аргументов
       • Пример, как функция будет вызываться: int a = printAndRead(“Введите число:”) */
    private static int printAndRead(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(request);

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число 10:");

        while (a != 10) {
            a = printAndRead("Неверно! Введите число 10:");
        }

        System.out.println("Вы ввели 10. Конец!");
    }
}
