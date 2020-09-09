package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class MaxMinIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите 2-е целое число:");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " - наибольшее из двух");
            System.out.println(number2 + " - наименьшее из двух");
        } else {
            System.out.println(number2 + " - наибольшее из двух");
            System.out.println(number1 + " - наименьшее из двух");
        }
    }
}
