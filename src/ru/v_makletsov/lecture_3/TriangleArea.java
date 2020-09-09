package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату первой точки x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координату первой точки y1:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координату первой точки x2:");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координату первой точки y1:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координату первой точки x3:");
        double x3 = scanner.nextDouble();
        System.out.println("Введите координату первой точки y3:");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs((y3 - y1) * (x2 - x1) - (x3 - x1) * (y2 - y1)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            double halfPerimeter = (a + b + c) / 2;

            double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
            System.out.printf("Площадь треугольника равна: %.2f", area);
        }
    }
}
