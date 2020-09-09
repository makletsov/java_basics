package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Введите код операции: ");
        int command = scanner.nextInt();

        double result;

        switch (command) {
            case 1:
                result = number1 + number2;
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, result);
                break;
            case 2:
                result = number1 - number2;
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, result);
                break;
            case 3:
                result = number1 * number2;
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, result);
                break;
            case 4:
                result = number1 / number2;
                System.out.printf("%.2f / %.2f = %.2f", number1, number2, result);
                break;
            default:
                System.out.println("Вы ввели неизвестный код операции");
        }
    }
}
