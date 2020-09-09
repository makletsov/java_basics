package ru.v_makletsov.lecture_4;

public class ArithmeticMeanDoWhile {
    public static void main(String[] args) {
        final int lowRange = 7;
        final int highRange = 18;
        int i = lowRange;
        int count = 0;
        int sum = 0;

        do {
            sum += i;
            count++;
            i++;
        } while (i <= highRange);

        double average = (double) sum / count;
        System.out.printf("Среднее арифметическое всех целых чисел от %d до %d равно %.2f%n", lowRange, highRange, average);

        i = lowRange;
        count = 0;
        sum = 0;

        do {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        } while (i <= highRange);

        average = (double) sum / count;
        System.out.printf("Среднее арифметическое всех четных чисел от %d до %d равно %.2f%n", lowRange, highRange, average);
    }
}
