package ru.v_makletsov.lecture_9;

public class FindMax {
    /* • Написать функцию, которая ищет максимальное число в массиве вещественных чисел */

    private static double getArrayMaxNumber(double[] numbers) {
        double max = numbers[0];

        for (double number : numbers) {
            if (max < number) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 2, 10, 15, 888, 170, 123, 313, 674, 3, 45};

        System.out.println("Максимальный элемент массива - " + getArrayMaxNumber(numbers));
    }
}
