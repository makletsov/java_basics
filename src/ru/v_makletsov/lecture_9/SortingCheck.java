package ru.v_makletsov.lecture_9;

public class SortingCheck {
    /* • Написать функцию, которая проверяет, что массив отсортирован по возрастанию
       • И написать функцию, которая проверяет, что массив отсортирован по убыванию */

    private static boolean isAscendingSorted(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isDescendingSorted(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 3, 6, 9, 12, 45, 68, 93, 101, 112, 135};

        if (isAscendingSorted(numbers)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else if (isDescendingSorted(numbers)) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}
