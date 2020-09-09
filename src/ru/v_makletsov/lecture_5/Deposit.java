package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class Deposit {
    /* • Напишите программу, которая рассчитывает сумму банковского вклада с заданной ставкой % годовых на заданное число месяцев
       • Вклад с капитализацией – считаем, что после истечения каждого месяца к сумме вклада прибавляется процент от суммы вклада на начало месяца
       • Также распечатать прибыль*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в $:");
        double initialDepositAmount = scanner.nextDouble();

        if (initialDepositAmount <= 0) {
            System.out.println("Сумма вклада не может быть отрицательной или равной 0");
            return;
        }

        System.out.println("Введите значение процентной ставки:");
        double yearInterestRate = scanner.nextDouble();

        if (yearInterestRate <= 0) {
            System.out.println("Процентная ставка не может быть отрицательной или равной 0");
            return;
        }

        System.out.println("Введите срок вклада в месяцах:");
        int monthsAmount = scanner.nextInt();

        if (monthsAmount < 1) {
            System.out.println("Срок вклада не может быть меньше 1 месяца");
            return;
        }

        final int maxPercent = 100;
        final int yearMonthsAmount = 12;
        double monthInterestRate = yearInterestRate / yearMonthsAmount;
        double currentDepositAmount = initialDepositAmount;

        for (int i = 1; i <= monthsAmount; i++) {
            currentDepositAmount = currentDepositAmount + currentDepositAmount * monthInterestRate / maxPercent;
        }

        double profit = currentDepositAmount - initialDepositAmount;

        System.out.printf("При вкладе в %.2f$ под %.1f%% на %d месяцев:%n", initialDepositAmount, yearInterestRate, monthsAmount);
        System.out.printf("Итоговая сумма составит - %.2f$%n", currentDepositAmount);
        System.out.printf("Прибыль составит - %.2f$", profit);
    }
}
