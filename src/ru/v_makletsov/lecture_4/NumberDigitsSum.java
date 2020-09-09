package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class NumberDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int inputNumber = scanner.nextInt();

        int number = inputNumber;
        int sum = 0;
        int oddSum = 0;
        int maxDigit = 0;

        do {
            int digit = number % 10;
            sum += digit;

            if (digit % 2 != 0) {
                oddSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            number = number / 10;
        } while (number != 0);

        System.out.printf("Сумма всех цифр числа     %5d равна - %5d%n", inputNumber, sum);
        System.out.printf("Сумма нечетных цифр числа %5d равна - %5d%n", inputNumber, oddSum);
        System.out.printf("Наибольшая цифра числа    %5d равна - %5d%n", inputNumber, maxDigit);
    }
}
