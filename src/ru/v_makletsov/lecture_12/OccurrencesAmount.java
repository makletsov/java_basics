package ru.v_makletsov.lecture_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesAmount {
    private static int getOccurrencesAmount(String string, String desiredString) {
        int index = 0;
        int count = 0;
        String lowerCaseDesiredString = desiredString.toLowerCase();

        while (index >= 0) {
            index = string.indexOf(lowerCaseDesiredString, index);

            if (index >= 0) {
                index += desiredString.length();
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            String desiredString = "Мы";

            int count = 0;

            while (scanner.hasNextLine()) {
                count += getOccurrencesAmount(scanner.nextLine().toLowerCase(), desiredString);
            }

            System.out.println("Число вхождений искомой строки в тексте файла: " + count);
        }
    }
}
