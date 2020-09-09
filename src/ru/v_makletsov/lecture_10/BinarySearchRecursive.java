package ru.v_makletsov.lecture_10;

public class BinarySearchRecursive {
    private static int getDesiredElementIndex(int[] array, int left, int right, int desiredElement) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == desiredElement) {
            return middle;
        }

        if (array[middle] > desiredElement) {
            return getDesiredElementIndex(array, left, middle - 1, desiredElement);
        } else {
            return getDesiredElementIndex(array, middle + 1, right, desiredElement);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 10, 15, 123, 170, 313, 674, 717, 923, 1024, 1111, 1256};
        int desiredElement = 1024;

        int desiredElementIndex = getDesiredElementIndex(numbers, 0, numbers.length - 1, desiredElement);

        if (desiredElementIndex < 0) {
            System.out.printf("Элемент %d не найден в массиве", desiredElement);
        } else {
            System.out.printf("Элемент %d находится в массиве под номером %d%n", desiredElement, desiredElementIndex);
        }
    }
}
