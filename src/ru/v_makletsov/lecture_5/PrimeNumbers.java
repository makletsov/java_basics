package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /* • Задача на дом "Простые числа".
           • Прочитать с консоли целое число
           • Найти и распечатать все простые числа, не превышающие введенное число*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int inputNumber = scanner.nextInt();

        if (inputNumber < 2) {
            System.out.println("Число слишком маленькое");
        } else {
            System.out.printf("Все простые числа от 2 до %d:%n", inputNumber);

            for (int i = 2; i <= inputNumber; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (!isPrime) {
                    continue;
                }

                System.out.println(i);
            }
        }
    }
}
