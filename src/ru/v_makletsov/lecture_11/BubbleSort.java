package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class BubbleSort {
    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
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
