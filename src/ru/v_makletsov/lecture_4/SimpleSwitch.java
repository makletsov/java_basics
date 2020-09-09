package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class SimpleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду");
        String order = scanner.nextLine();

        switch (order) {
            case "print":
                System.out.println("Введите строку:");
                String line = scanner.nextLine();
                System.out.println("Вы ввели: " + line);
                break;
            case "sum":
                System.out.println("Введите превое число: ");
                double number1 = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                double number2 = scanner.nextDouble();

                double sum = number1 + number2;
                System.out.println("Сумма чисел равна: " + sum);
                break;
            default:
                System.out.println("Вы ввели неизвестную команду");
        }
    }
}
