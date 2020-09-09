package ru.v_makletsov.lecture_2;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для вычисления площади введите длину первой стороны прямоугольника, в качестве разделителя используйте \",\" ");
        double side1 = scanner.nextDouble();

        System.out.println("Введите длину второй стороны прямоугольника ");
        double side2 = scanner.nextDouble();

        double area = side1 * side2;
        System.out.printf("%-9s = %.2f%n%-9s = %.2f%n%-9s = %.2f%n", "Сторона 1", side1, "Сторона 2", side2, "Площадь", area);
    }
}
