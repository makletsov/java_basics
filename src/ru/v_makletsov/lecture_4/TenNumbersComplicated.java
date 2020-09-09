package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class TenNumbersComplicated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int lowRange = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int highRange = scanner.nextInt();

        System.out.println("Введите количество выводимых чисел в строке: ");
        int stringAmount = scanner.nextInt();

        int i = lowRange;

        while (i <= highRange) {
            System.out.printf("%5d ", i);
            if (((i - lowRange + 1) % stringAmount == 0) && ((i - lowRange) != 0)) {
                System.out.println();
            }
            i++;
        }
    }
}
