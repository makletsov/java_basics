package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class Heapsort {
    private static void swapArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void siftArrayElement(int[] array, int siftStartElementIndex, int notSortedPartAmount) {
        int currentIndex = siftStartElementIndex;

        while (true) {
            int maxChildIndex;

            if (2 * currentIndex + 2 < notSortedPartAmount) {
                maxChildIndex = (array[2 * currentIndex + 1] > array[2 * currentIndex + 2])
                        ? (2 * currentIndex + 1)
                        : (2 * currentIndex + 2);
            } else if (2 * currentIndex + 1 < notSortedPartAmount) {
                maxChildIndex = 2 * currentIndex + 1;
            } else {
                break;
            }

            if (array[currentIndex] < array[maxChildIndex]) {
                swapArrayElements(array, maxChildIndex, currentIndex);

                currentIndex = maxChildIndex;
            } else {
                break;
            }
        }
    }

    private static void sortArray(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftArrayElement(array, i, array.length);
        }

        for (int i = array.length - 1; i > 0; i--) {
            swapArrayElements(array, 0, i);

            siftArrayElement(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, -22, 2, 10, 3, 15, 12, 888, 170, 321, 123, 1000, 313, -20, 674, 3, 45, -33, 999, -44};

        System.out.println("Дан массив:");
        System.out.println(Arrays.toString(numbers));

        sortArray(numbers);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(numbers));
    }
}
