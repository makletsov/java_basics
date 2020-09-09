package ru.v_makletsov.lecture_4;

import java.util.Scanner;

public class SequenceSumm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество членов ряда: ");
        int sequenceAmount = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= sequenceAmount) {
            sum += Math.pow(i, 2) * Math.pow(-1, i - 1);
            i++;
        }
        System.out.printf("Сумма ряда из %d членов равна %d", sequenceAmount, sum);
    }
}
