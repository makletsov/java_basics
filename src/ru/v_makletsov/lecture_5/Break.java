package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        /* • Задача на дом "Break".
           • В программе должна быть некоторая загаданная фиксированная строка
           • Далее программа предлагает пользователю ввести строку, пользователь вводит
           • Если введена та загаданная строка, то программа должна завершаться
           • Иначе пользователю дается следующая попытка для ввода т.д., пока не введет правильно. При этом каждый раз
             пользователю должно выдаваться приглашение для ввода
           • В этой задаче используйте бесконечный цикл и break*/
        Scanner scanner = new Scanner(System.in);

        String password = "password";

        while (true) {
            System.out.println("Введите пароль:");
            String inputPassword = scanner.nextLine();

            if (password.equals(inputPassword)) {
                break;
            }
        }

        System.out.println("Верно!");
    }
}
