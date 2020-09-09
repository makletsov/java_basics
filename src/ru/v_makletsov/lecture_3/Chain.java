package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class Chain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое число:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (number == 0) {
            System.out.println("Вы ввели 0");
        } else {
            System.out.println("Вы ввели положительное число");
        }
    }
}
