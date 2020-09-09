package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class FunctionExercise1 {
    /* • Написать функцию, которая принимает вещественные числа x и y, и вычисляет 3x + 4y
       • Вызвать ее из main несколько раз с разными аргументами*/
    private static double getAmount(double number1, double number2) {
        return 3 * number1 + 4 * number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x:");
        double number1 = scanner.nextDouble();

        System.out.println("Введите значение y:");
        double number2 = scanner.nextDouble();

        double result = getAmount(number1, number2);
        System.out.printf("Значение функции при x = %.2f и y = %.2f равно %.2f", number1, number2, result);
    }
}
