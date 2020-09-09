package ru.v_makletsov.lecture_8;

import java.util.Scanner;

import java.lang.Character;

public class Palindrome {
    /* • Объявить некоторую строковую переменную в программе
       • Проверить, что данная строка является палиндромом – то есть читается одинаково слева направо и справа налево.
       • При проверке не учитывать регистр символов, учитывать только буквы
       • Пример палиндрома: «Аргентина манит негра»
       • Требование: сделать без создания новой строки и без удаления символов из строки */

    private static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            char leftCharacter = string.charAt(i);
            char rightCharacter = string.charAt(j);

            while (!Character.isLetter(rightCharacter)) {
                j--;

                if (j == i) {
                    return true;
                }

                rightCharacter = string.charAt(j);
            }

            while (!Character.isLetter(leftCharacter)) {
                i++;
                leftCharacter = string.charAt(i);
            }

            if ((Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        if (isPalindrome(string)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
