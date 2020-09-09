package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "password";

        System.out.println("Введите пароль:");
        String inputPassword = scanner.nextLine();

        if (password.length() < inputPassword.length()) {
            System.out.println("Введенная строка слишком длинная");
        } else if (password.length() > inputPassword.length()) {
            System.out.println("Введенная строка слишком короткая");
        } else {
            if (password.equals(inputPassword)) {
                System.out.println("Пароль верный");
            } else {
                System.out.println("Пароль неверный");
            }
        }
    }
}
