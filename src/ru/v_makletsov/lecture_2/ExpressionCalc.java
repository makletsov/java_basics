package ru.v_makletsov.lecture_2;

public class ExpressionCalc {
    public static void main(String[] args) {
        double x = 3 - (56.0 - 12.0) / 44 * 4 / 2;
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
