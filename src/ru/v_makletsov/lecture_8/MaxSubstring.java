package ru.v_makletsov.lecture_8;

import java.util.Scanner;

public class MaxSubstring {
    /* • Написать функцию, которая ищет в строке подстроку максимальной длины, состоящую из одного
         и того же символа, и выдает эту максимальную длину
       • Например, есть строка "аааббдеггггв", должно выдаться число 4, потому что есть 4 подряд
         символа «г», и это максимальная подстрока, где подряд идет один и тот же символ
       • Функция должна работать без учета регистра */

    private static int getMaxSubstringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }

        char currentCharacter = string.charAt(0);
        int maxSubstringLength = 0;
        int currentSubstringLength = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(currentCharacter)) {
                currentSubstringLength++;
                maxSubstringLength = Math.max(maxSubstringLength, currentSubstringLength);
            } else {
                currentCharacter = string.charAt(i);
                maxSubstringLength = Math.max(maxSubstringLength, currentSubstringLength);
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        System.out.printf("Максимальное количество подряд повторяющихся символов - %d", getMaxSubstringLength(string));
    }
}
