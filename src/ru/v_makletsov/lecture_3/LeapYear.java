package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int inputYear = scanner.nextInt();

        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
