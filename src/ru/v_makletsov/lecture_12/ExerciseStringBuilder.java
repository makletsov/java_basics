package ru.v_makletsov.lecture_12;

public class ExerciseStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

        System.out.println(stringBuilder);
    }
}
