package ru.v_makletsov.lecture_9;

public class ArrayMultiplicationTable {
    /* • Написать функцию, которая создает двумерный массив с таблицей умножения
       • Размер таблицы должен быть параметром функции
       • Вызвать функцию и распечатать результат в main */

    private static int[][] getMultiplicationTableArray(int maxMultiplier) {
        int[][] multiplicationTable = new int[maxMultiplier][maxMultiplier];

        for (int i = 0; i < maxMultiplier; i++) {
            for (int j = 0; j < maxMultiplier; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        int maxMultiplier = 40;

        String maxMultiplierSquareToString = "" + maxMultiplier * maxMultiplier;
        String outputCellFormat = "%" + maxMultiplierSquareToString.length() + "d ";

        int[][] table = getMultiplicationTableArray(maxMultiplier);

        for (int[] row : table) {
            for (int cell : row) {
                System.out.printf(outputCellFormat, cell);
            }
            System.out.println();
        }
    }
}
