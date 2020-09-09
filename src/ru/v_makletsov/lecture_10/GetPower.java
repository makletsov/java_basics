package ru.v_makletsov.lecture_10;

import java.util.Scanner;

public class GetPower {
    /* • Написать рекурсивную функцию возведения целого числа в целую неотрицательную степень (упрощенный аналог Math.pow)
       • Нельзя использовать Math.pow
       • Когда закончите – напишите тут же нерекурсивную функцию*/

    private static long getPowerRecursive(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return getPowerRecursive(number, power - 1) * number;
    }

    private static long getPower(int number, int power) {
        long result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число - основание степени:");
        int number = scanner.nextInt();

        System.out.println("Введите показатель степени:");
        int power = scanner.nextInt();

        System.out.printf("Результат возведения числа %d в степень %d равен %d%n", number, power, getPowerRecursive(number, power));
        System.out.printf("Результат возведения числа %d в степень %d равен %d%n", number, power, getPower(number, power));
    }
}
