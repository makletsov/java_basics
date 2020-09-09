package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class InsertionSort {
    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= -1; j--) {
                if ((j < 0) || (temp >= array[j])) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];
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
