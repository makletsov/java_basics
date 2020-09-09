package ru.v_makletsov.lecture_4;

public class TenNumbersBasic {
    public static void main(String[] args) {
        final int lowRange = 1;
        final int highRange = 100;
        int i = lowRange;

        while (i <= highRange) {
            System.out.printf("%3d ", i);
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
