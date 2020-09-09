package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class ForLoopExercise2 {
    public static void main(String[] args) {
        //Распечатать числа кратные 4, от 0 до 100 в обратном порядке.
        int divisor = 4;

        for (int i = 100; i >= 1; i--) {
            if (i % divisor == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        //Распечатать квадраты чисел от нуля до некоторого числа, заданного в коде.
        int maxMultiplier = 16;

        for (int i = 1; i <= maxMultiplier; i++) {
            System.out.println((int) Math.pow(i, 2));
        }

        //Распечатать среднее арифметическое чисел от X до Y при помощи цикла for
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Введенные числа равны. Среднее арифметическое равно: " + number1);
        } else {
            int min;
            int max;

            if (number1 > number2) {
                max = number1;
                min = number2;
            } else {
                max = number2;
                min = number1;
            }

            int sum = 0;
            int count = 0;

            for (int i = min; i <= max; i++) {
                sum += i;
                count++;
            }

            double average = (double) sum / count;
            System.out.println("Среднее арифметическое равно: " + average);
        }
    }
}
