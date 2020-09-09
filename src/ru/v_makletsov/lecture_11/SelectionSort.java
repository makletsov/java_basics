package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class SelectionSort {
    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElement = array[i];
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (minElement > array[j]) {
                    minElement = array[j];
                    minElementIndex = j;
                }
            }

            array[minElementIndex] = array[i];
            array[i] = minElement;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, -22, 2, 10, 3, 15, 12, 888, 170, 321, 123, 313, -20, 674, 3, 45};

        System.out.println("Дан массив:");
        System.out.println(Arrays.toString(numbers));

        sortArray(numbers);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(numbers));
    }
}
