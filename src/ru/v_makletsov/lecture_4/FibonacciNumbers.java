package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Порядковый номер не может быть меньше 0");
        } else {
            int finalFibonacciNumber;

            if (number == 0) {
                finalFibonacciNumber = 0;
            } else {
                int previousFibonacciNumber = 0;
                int currentFibonacciNumber = 1;
                int nextFibonacciNumber;
                int i = 2;

                while (i <= number) {
                    nextFibonacciNumber = currentFibonacciNumber + previousFibonacciNumber;
                    previousFibonacciNumber = currentFibonacciNumber;
                    currentFibonacciNumber = nextFibonacciNumber;
                    i++;
                }

                finalFibonacciNumber = currentFibonacciNumber;
            }

            System.out.printf("Число Фибоначчи под номером %d равно %d", number, finalFibonacciNumber);
        }
    }
}
