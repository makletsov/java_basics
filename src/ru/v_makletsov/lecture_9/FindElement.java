package ru.v_makletsov.lecture_9;

public class FindElement {
    /* • Написать функцию, которая ищет указанное число в массиве, и если находит его, то выдает его индекс. А если
         не находит, то выдает -1 */

    private static int getDesiredElementIndex(double[] numbers, double desiredElement) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == desiredElement) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 2, 10, 15, 888, 170, 123, 313, 674, 3, 45};
        double desiredElement = 170;

        int desiredElementIndex = getDesiredElementIndex(numbers, desiredElement);

        if (desiredElementIndex > -1) {
            System.out.printf("Элемент %.1f находится в массиве под номером %d", desiredElement, desiredElementIndex);
        } else {
            System.out.printf("Элемент %.1f не найден в массиве", desiredElement);
        }
    }
}
