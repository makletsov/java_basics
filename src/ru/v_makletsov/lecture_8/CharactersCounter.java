package ru.v_makletsov.lecture_8;

import java.util.Scanner;

public class CharactersCounter {
    /* • Прочитать с консоли строку
       • Вывести число букв в этой строке
       • Вывести число цифр в этой строке
       • Вывести число пробелов в этой строке
       • Вывести число остальных символов в строке */

    private static String getFormatString(String entryString, int fieldWidth) {
        return entryString + "%" + fieldWidth + "d%n";
    }

    private static int getFieldWidth(int number1, int number2, int number3, int number4) {
        String maxField = "" + Math.max(Math.max(number1, number2), Math.max(number3, number4));

        return maxField.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();

        int digitsCount = 0;
        int lettersCount = 0;
        int whitespacesCount = 0;
        int othersCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                digitsCount++;
            } else if (Character.isLetter(string.charAt(i))) {
                lettersCount++;
            } else if (Character.isWhitespace(string.charAt(i))) {
                whitespacesCount++;
            } else {
                othersCount++;
            }
        }

        int fieldWidth = getFieldWidth(digitsCount, lettersCount, whitespacesCount, othersCount);

        System.out.printf(getFormatString("Количество цифр в введенной строке:               ", fieldWidth), digitsCount);
        System.out.printf(getFormatString("Количество букв в введенной строке:               ", fieldWidth), lettersCount);
        System.out.printf(getFormatString("Количество пробелов в введенной строке:           ", fieldWidth), whitespacesCount);
        System.out.printf(getFormatString("Количество остальных символов в введенной строке: ", fieldWidth), othersCount);
    }
}
