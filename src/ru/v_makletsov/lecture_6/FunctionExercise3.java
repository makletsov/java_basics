package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class FunctionExercise3 {
    /* • Написать функции для вычисления минимума и максимума из двух целых чисел
       • Вызвать функции из main */
    private static int getMax(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    private static int getMin(int number1, int number2) {
        return (number1 < number2) ? number1 : number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            int max = getMax(number1, number2);
            int min = getMin(number1, number2);

            System.out.printf("Из двух целых чисел %d и %d:%n", number1, number2);
            System.out.println("Максимальное - " + max);
            System.out.println("Минимальное - " + min);
        }
    }
}
