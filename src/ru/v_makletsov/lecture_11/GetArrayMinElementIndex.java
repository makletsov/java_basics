package ru.v_makletsov.lecture_11;

import java.util.Arrays;

public class GetArrayMinElementIndex {
    /* • Реализовать функцию поиска минимума в массиве
       • Переделать на функцию, которая ищет индекс, по которому лежит минимум в массиве
       • Переделать, чтобы функция поиска индекса минимума работала не по всему массиву, а только в части массива, начинающейся с индекса start */

    private static int getArrayPartMinElementIndex(int[] array, int start) {
        int minElement = array[start];
        int minElementIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                minElementIndex = i;
            }
        }

        return minElementIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {1, -22, 2, 10, 3, 15, 12, 888, 170, 321, 123, 313, -20, 674, 3, 45};

        System.out.println("Дан массив:");
        System.out.println(Arrays.toString(numbers));

        final int startIndex = 2;
        int minElementIndex = getArrayPartMinElementIndex(numbers, startIndex);

        System.out.printf("Индекс инимального элемента массива, начиная с %d-го равен %d", startIndex, minElementIndex);
    }
}
