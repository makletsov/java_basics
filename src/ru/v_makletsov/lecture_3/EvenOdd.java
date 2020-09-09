package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.print("Введенное число - нечетное");
        } else {
            System.out.print("Веденное число - четное");
        }

        if (number % 5 == 0) {
            System.out.println(", кратно 5");
        } else {
            System.out.println(", не кратно 5");
        }
    }
}
