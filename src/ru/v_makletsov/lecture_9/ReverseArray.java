package ru.v_makletsov.lecture_9;

import java.util.Arrays;

public class ReverseArray {
    /* • Переставить элементы массива в обратном порядке */

    private static void reverseArray(double[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static void main(String[] args) {
        double[] numbers = {1, 2, 10, 15, 888, 170, 123, 313, 674, 3, 45};

        System.out.print(Arrays.toString(numbers));
        System.out.println();

        reverseArray(numbers);

        System.out.print(Arrays.toString(numbers));
    }
}



