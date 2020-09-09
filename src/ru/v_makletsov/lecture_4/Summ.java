package ru.v_makletsov.lecture_4;

public class Summ {
    public static void main(String[] args) {
        int i = 0;
        int summ1 = 0;

        while (i <= 9) {
            summ1 += i;
            i++;
        }
        System.out.println("Сумма чисел от 0 до 9 равна: " + summ1);

        int j = 3;
        int summ2 = 0;
        int summ3 = 0;
        int evenAmount = 0;

        while (j <= 21) {
            summ2 += j;
            if (j % 2 == 0) {
                summ3 += j;
                evenAmount++;
            }
            j++;
        }
        System.out.println("Сумма чисел от 3 до 21 равна: " + summ2);
        System.out.println("Сумма четных чисел от 3 до 21 равна: " + summ3);
        System.out.println("Количество чисел от 3 до 21 равно: " + evenAmount);

    }
}
