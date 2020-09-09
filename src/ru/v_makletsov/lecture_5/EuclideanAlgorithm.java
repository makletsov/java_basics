package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int inputNumber1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int inputNumber2 = scanner.nextInt();

        if ((inputNumber1 == 0) && (inputNumber2 == 0)) {
            System.out.println("Оба числа равны 0");
        } else if ((inputNumber1 == 0) || (inputNumber2 == 0)) {
            int greatestCommonDivisor;

            if (inputNumber1 == 0) {
                greatestCommonDivisor = inputNumber2;
            } else {
                greatestCommonDivisor = inputNumber1;
            }

            System.out.printf("НОД чисел %d и %d равен %d", inputNumber1, inputNumber2, greatestCommonDivisor);
        } else {
            int number1 = Math.abs(inputNumber1);
            int number2 = Math.abs(inputNumber2);

            while (number1 % number2 != 0) {
                int temp = number2;
                number2 = number1 % number2;
                number1 = temp;
            }

            int greatestCommonDivisor = number2;
            System.out.printf("НОД чисел %d и %d равен %d", inputNumber1, inputNumber2, greatestCommonDivisor);
        }
    }
}

