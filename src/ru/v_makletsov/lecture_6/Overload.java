package ru.v_makletsov.lecture_6;

public class Overload {
    /* • Объявить в классе несколько функций с именем getTypeSize
       • Каждая функция должна принимать один аргумент одного из следующих типов: byte, short, int, long, float, double
       • Функция должна возвращать int – количество байт, требуемых под переменную данного типа
       • В функции main сделать по одному примеру использования для каждой перегруженной функции
       • В этой задаче может быть warning, что аргумент не используется, его не исправляем */
    private static int getTypeSize(byte number) {
        return 1;
    }

    private static int getTypeSize(short number) {
        return 2;
    }

    private static int getTypeSize(int number) {
        return 4;
    }

    private static int getTypeSize(long number) {
        return 8;
    }

    private static int getTypeSize(float number) {
        return 4;
    }

    private static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 1;
        int intNumber = 1;
        long longNumber = 1;
        float floatNumber = 1;
        double doubleNumber = 1;

        System.out.printf("Переменная типа byte занимает   %d байт памяти%n", getTypeSize(byteNumber));
        System.out.printf("Переменная типа short занимает  %d байт памяти%n", getTypeSize(shortNumber));
        System.out.printf("Переменная типа int занимает    %d байт памяти%n", getTypeSize(intNumber));
        System.out.printf("Переменная типа long занимает   %d байт памяти%n", getTypeSize(longNumber));
        System.out.printf("Переменная типа float занимает  %d байт памяти%n", getTypeSize(floatNumber));
        System.out.printf("Переменная типа double занимает %d байт памяти", getTypeSize(doubleNumber));
    }
}
