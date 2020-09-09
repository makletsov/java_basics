package ru.v_makletsov.lecture_5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1;

        System.out.println("Угадайте число от 0 до 100");
        int inputNumber = scanner.nextInt();

        int triesCount = 1;

        while (inputNumber != guessNumber) {
            if (inputNumber > guessNumber) {
                System.out.println("Много!");
            } else {
                System.out.println("Мало!");
            }

            inputNumber = scanner.nextInt();
            triesCount++;
        }

        System.out.printf("Верно! С %d попытки.", triesCount);
    }
}
