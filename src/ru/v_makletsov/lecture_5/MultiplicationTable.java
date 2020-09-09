package ru.v_makletsov.lecture_5;

import java.util.Scanner;

public class MultiplicationTable {
    /* • Вывести в консоль таблицу умножения чисел от 1 до 10 при помощи циклов for
       • Но программа должна работать верно и если попросят таблицу от 1 до другого числа
       • Примерно так, только без границ клеток, консоль этого не позволяет
       • Добейтесь чтобы числа были выровнены по столбцам (добейте числа нужным количеством пробелов)
       • Добавьте «шапку» таблицы, отделите ее символами, например, | и --*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите наибольший необходимый множитель таблицы умножения");
        int inputNumber = scanner.nextInt();

        if (inputNumber < 1) {
            System.out.println("Вы ввели число меньше 1");
            return;
        }

        String inputNumberToString = "" + inputNumber;
        int inputNumberLength = inputNumberToString.length();

        for (int i = 1; i <= inputNumberLength; i++) {
            System.out.print(" ");
        }
        System.out.print("| ");

        String inputNumberSquareToString = "" + inputNumber * inputNumber;
        int inputNumberSquareLength = inputNumberSquareToString.length();
        String currentNumberStringMask = "%" + inputNumberSquareLength + "d| ";

        for (int i = 1; i <= inputNumber; i++) {
            System.out.printf(currentNumberStringMask, i);
        }

        System.out.println();

        for (int i = 0; i <= inputNumberLength; i++) {
            System.out.print("-");
        }

        for (int i = 1; i <= inputNumber * (inputNumberSquareLength + 2); i++) {
            System.out.print("-");
        }

        System.out.println();

        currentNumberStringMask = "%" + inputNumberLength + "d|";
        String currentMultipliedNumberStringMask = " %" + inputNumberSquareLength + "d ";

        for (int i = 1; i <= inputNumber; i++) {
            System.out.printf(currentNumberStringMask, i);

            for (int j = 1; j <= inputNumber; j++) {
                System.out.printf(currentMultipliedNumberStringMask, j * i);
            }

            System.out.println();
        }
    }
}
