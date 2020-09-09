package ru.v_makletsov.lecture_9;

import java.util.Arrays;

public class ExerciseOne {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(numbers));
    }
}
