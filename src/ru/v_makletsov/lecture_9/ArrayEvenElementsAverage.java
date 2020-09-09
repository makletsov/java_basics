package ru.v_makletsov.lecture_9;

public class ArrayEvenElementsAverage {
    /* • Найти среднее арифметическое элементов массива, которые являются четными числами */

    private static double getArrayEvenElementsAverage(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 10, 15, 888, 170, 123, 313, 674, 3, 45};

        System.out.printf("Среденее арифметическое четных элементов массива равно %.1f", getArrayEvenElementsAverage(numbers));
    }
}
