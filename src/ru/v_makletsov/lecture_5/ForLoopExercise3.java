package ru.v_makletsov.lecture_5;

public class ForLoopExercise3 {
    public static void main(String[] args) {
        /*Реализовать цикл for, который печатает числа от 1 до 100, и завершается если текущее число больше
          либо равно 30*/
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            if (i >= 30) {
                break;
            }
        }
    }
}
