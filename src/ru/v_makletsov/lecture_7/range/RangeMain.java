package ru.v_makletsov.lecture_7.range;

import java.util.Scanner;

public class RangeMain {
    private static void printHelp() {
        System.out.println("\"set_from\"   - задать координату начальной границы диапазона");
        System.out.println("\"set_to\"     - задать координату конечной границы диапазона");
        System.out.println("\"get_from\"   - вывести значение начальной границы диапазона");
        System.out.println("\"get_to\"     - вывести значение конечной границы диапазона");
        System.out.println("\"get_length\" - вывести значение длины диапазона");
        System.out.println("\"is_inside\"  - ввести координату точки и проверить ее на принадлежность заданному ранее диапазону");
        System.out.println("\"end\"        - закончить работу с программой");
    }

    private static String getNextCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату начала диапазона:");
        double from = scanner.nextDouble();

        System.out.println("Введите координату конца диапазона:");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        System.out.println("Введите команду:");
        printHelp();

        scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "help":
                    printHelp();

                    command = getNextCommand();
                    break;
                case "set_from":
                    System.out.println("Введите координату начала диапазона:");
                    range.setFrom(scanner.nextDouble());

                    command = getNextCommand();
                    break;
                case "get_from":
                    System.out.printf("Координата начала диапазона: %.2f%n", range.getFrom());

                    command = getNextCommand();
                    break;
                case "set_to":
                    System.out.println("Введите координату конца диапазона:");
                    range.setTo(scanner.nextDouble());

                    command = getNextCommand();
                    break;
                case "get_to":
                    System.out.printf("Координата конца диапазона: %.2f%n", range.getTo());

                    command = getNextCommand();
                    break;
                case "get_length":
                    System.out.printf("Длина диапазона равна: %.2f%n", range.getLength());

                    command = getNextCommand();
                    break;
                case "is_inside":
                    System.out.println("Введите координаты точки");

                    if (scanner.hasNextDouble()) {
                        double point = scanner.nextDouble();

                        if (range.isInside(point)) {
                            System.out.println("Точка принадлежит диапазону");
                        } else {
                            System.out.println("Точка не принадлежит диапазону");
                        }

                        command = getNextCommand();
                    } else {
                        System.out.println("Нужно ввести числовую координату. Попробуйте еще раз.");

                        command = getNextCommand();
                    }

                    break;
                default:
                    System.out.println("Неопозннаная команда. Введите команду еще раз");

                    command = scanner.nextLine();
                    break;
            }
        }
    }
}
