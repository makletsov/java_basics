package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class FunctionExercise2 {
    /* • Написать функцию, вычисляющую среднее арифметическое целых чисел от begin до end включительно
       • Вызвать ее из main*/
    private static double getAverage(int number1, int number2) {
        int highRange;
        int lowRange;

        if (number1 <= number2) {
            lowRange = number1;
            highRange = number2;
        } else {
            lowRange = number2;
            highRange = number1;
        }

        int sum = 0;
        int count = 0;

        for (int i = lowRange; i <= highRange; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное значение диапазона: ");
        int begin = scanner.nextInt();

        System.out.println("Введите конечное значение диапазона: ");
        int end = scanner.nextInt();

        double average = getAverage(begin, end);
        System.out.printf("Среднее арифметическое всех целых чисел от %d до %d равно %.2f", begin, end, average);
    }
}
