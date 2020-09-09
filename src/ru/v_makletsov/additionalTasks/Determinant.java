package ru.v_makletsov.additionalTasks;

import java.util.Arrays;

public class Determinant {
    private static double[][] getMinor(double[][] matrix, int column) {
        double[][] minor = new double[matrix.length - 1][matrix.length - 1];

        for (int i = 1; i < matrix.length; i++) {         // пропускаем всегда 1ю строку - по ней идет разложение
            int count = 0;

            for (int j = 0; j < matrix.length; j++) {
                if (j == column) {
                    continue;
                }

                minor[i - 1][count] = matrix[i][j];
                count++;
            }
        }

        return minor;
    }

    private static double getDeterminant(double[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double determinant = 0;

        for (int i = 0; i < matrix.length; i++) {
            int column = i + 1;
            int power = 1 + column;                        // 1 - номер строки по которой ведем разложение

            determinant += matrix[0][i] * Math.pow(-1, power) * getDeterminant(getMinor(matrix, i));
        }

        return determinant;
    }

    public static void main(String[] args) {
        double[][] matrix = {{1}};//{{1, 2, 2, 7}, {3, 4, 8, 5}, {9, 1, 3, 3}, {0, 4, 3, 5}};

        System.out.println("Дана матрица:");

        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println("Определитель матрицы равен: " + getDeterminant(matrix));
    }
}
