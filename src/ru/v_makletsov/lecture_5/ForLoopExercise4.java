package ru.v_makletsov.lecture_5;

public class ForLoopExercise4 {
    public static void main(String[] args) {
        /*Распечатать числа от 0 до 100, кроме числа 5, кроме всех чисел, кратных 3 и кроме чисел из
          диапазона от 60 до 80 включительно
          * Сделать версию с одним if’ом
          * Переписать при помощи while*/

        //Вариант с циклом for
        for (int i = 0; i <= 100; i++) {
            if ((i == 5) || (i % 3 == 0) || ((i >= 60) && (i <= 80))) {
                continue;
            }

            System.out.println(i);
        }

        //Вариант с циклом while
        int i = 0;

        while (i <= 100) {
            if ((i == 5) || (i % 3 == 0) || ((i >= 60) && (i <= 80))) {
                i++;
                continue;
            }

            System.out.println(i);

            i++;
        }
    }
}
