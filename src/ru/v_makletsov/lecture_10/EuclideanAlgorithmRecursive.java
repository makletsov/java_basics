package ru.v_makletsov.lecture_10;

import java.util.Scanner;

public class EuclideanAlgorithmRecursive {
    private static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 == 0) {
            return number2;
        }

        if (number2 == 0) {
            return number1;
        }

        if (number1 % number2 == 0) {
            return Math.abs(number2);
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для определения НОД двух чисел введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if ((number1 == 0) && (number2 == 0)) {
            System.out.println("Оба числа равны 0");
            return;
        }

        System.out.printf("НОД чисел %d и %d равен %d%n", number1, number2, getGreatestCommonDivisor(number1, number2));
    }
}
