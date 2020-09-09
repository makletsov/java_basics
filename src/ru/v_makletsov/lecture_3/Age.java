package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст");
        int age = scanner.nextInt();

        int maxAge = 112;
        int minAge = 1;

        if (age > maxAge) {
            System.out.println("Вы слишком стары");
        } else if (age < minAge) {
            System.out.println("Вы слишком малы");
        } else {
            if ((age / 10) % 10 != 1) {
                if (age % 10 == 1) {
                    System.out.println("Вам " + age + " год");
                } else if ((age % 10 == 2) || (age % 10 == 3) || (age % 10 == 4)) {
                    System.out.println("Вам " + age + " года");
                } else {
                    System.out.println("Вам " + age + " лет");
                }
            } else {
                System.out.println("Вам " + age + " лет");
            }
        }
    }
}
