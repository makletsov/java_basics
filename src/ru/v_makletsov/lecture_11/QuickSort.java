package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class QuickSort {
    private static void swapArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void sortArray(int[] array, int leftBound, int rightBound) {
        if (rightBound - leftBound <= 0) {
            return;
        }

        if (rightBound - leftBound == 1) {
            if (array[leftBound] > array[rightBound]) {
                swapArrayElements(array, leftBound, rightBound);
            }

            return;
        }

        double x = (array[leftBound] + array[rightBound]) / 2.0;
        int leftIndex = leftBound;
        int rightIndex = rightBound;

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < x) {
                leftIndex++;
            }

            while (array[rightIndex] > x) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swapArrayElements(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        sortArray(array, leftIndex, rightBound);
        sortArray(array, leftBound, rightIndex);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -22, 2, 10, 3, 15, 12, 888, 170, 321, 123, 313, -20, 674, 3, 45, -40, 88, 43, -1000, -560};

        System.out.println("Дан массив:");
        System.out.println(Arrays.toString(numbers));

        sortArray(numbers, 0, numbers.length - 1);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(numbers));
    }
}
