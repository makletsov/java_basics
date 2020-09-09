package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения:");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if ((Math.abs(a) <= epsilon) && (Math.abs(b) <= epsilon)) {
            if (Math.abs(c) > epsilon) {
                System.out.println("Уравнение не имеет решений");
            } else {
                System.out.println("Уравнение имеет бесконечное количество решений - любое число является решением");
            }
        } else if (Math.abs(a) <= epsilon) {
            System.out.println("Уравнение первой степени. Один корень:");

            double x = -c / b;
            System.out.println("x = " + x);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < -epsilon) {
                System.out.println("Корней нет");
            } else if (Math.abs(discriminant) <= epsilon) {
                System.out.println("Один корень:");

                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("Два корня:");

                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("x1 = %.3f%n", x1);

                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("x2 = %.3f", x2);
            }
        }
    }
}
