package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class MaxMinTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите 2-е целое число:");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;

        System.out.println(max + " - наибольшее из двух");
        System.out.println(min + " - наименьшее из двух");
    }
}
