package ru.v_makletsov.lecture_12;

public class LineBreak {
    private static int[] getNumbersArray(String string) {
        String[] stringsArray = string.split(", ");
        int[] numbersArray = new int[stringsArray.length];

        for (int i = 0; i < stringsArray.length; i++) {
            numbersArray[i] = Integer.parseInt(stringsArray[i]);
        }

        return numbersArray;
    }

    private static int getArraySum(int[] array) {
        int sum = 0;

        for (int e : array) {
            sum += e;
        }

        return sum;
    }

    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";

        int[] numbers = getNumbersArray(string);

        System.out.println("Сумма чисел в строке равна: " + getArraySum(numbers));
    }
}
