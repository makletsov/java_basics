package ru.v_makletsov.lecture_10;

public class BinarySearch {
    private static int getDesiredElementIndex(int[] array, int desiredElement) {
        int leftBound = 0;
        int rightBound = array.length - 1;

        while (leftBound <= rightBound) {
            int middle = (leftBound + rightBound) / 2;

            if (array[middle] == desiredElement) {
                return middle;
            }

            if (array[middle] > desiredElement) {
                rightBound = middle - 1;
            } else {
                leftBound = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 10, 15, 123, 170, 313, 674, 717, 923, 1024, 1111, 1256};
        int desiredElement = 1256;

        int desiredElementIndex = getDesiredElementIndex(numbers, desiredElement);

        if (desiredElementIndex < 0) {
            System.out.printf("Элемент %d не найден в массиве", desiredElement);
        } else {
            System.out.printf("Элемент %d находится в массиве под номером %d%n", desiredElement, desiredElementIndex);
        }
    }
}
