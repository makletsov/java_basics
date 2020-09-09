package ru.v_makletsov.lecture_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseFile {
    public static void main(String[] args) throws FileNotFoundException {
        String[] fileStrings = new String[38];

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            for (int i = 0; i < fileStrings.length; i++) {
                if (scanner.hasNextLine()) {
                    fileStrings[i] = scanner.nextLine();
                }
            }
        }

        for (String string : fileStrings) {
            if (string != null) {
                System.out.println(string);
            }
        }
    }
}
