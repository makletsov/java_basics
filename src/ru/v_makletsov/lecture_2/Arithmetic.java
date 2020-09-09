package ru.v_makletsov.lecture_2;

public class Arithmetic {
    public static void main(String[] args) {
        int int1 = 7;
        int int2 = 3;
        double double1 = 8;
        double double2 = 3;

        int intAdd = int1 + int2;
        int intSub = int1 - int2;
        int intMult = int1 * int2;
        int intDiv = int1 / int2;
        int intRest = int1 % int2;
        double intToDoubleDiv = (double) int1 / int2;
        double doubleAdd = double1 + double2;
        double doubleSub = double1 - double2;
        double doubleMult = double1 * double2;
        double doubleDiv = double1 / double2;

        System.out.println("Примеры операций с целыми числами:");
        System.out.println(int1 + " + " + int2 + " = " + intAdd);
        System.out.println(int1 + " - " + int2 + " = " + intSub);
        System.out.println(int1 + " * " + int2 + " = " + intMult);
        System.out.println(int1 + " / " + int2 + " = " + intDiv + " (остаток " + intRest + ")\t\t- целочисленное деление");
        System.out.println(int1 + " / " + int2 + " = " + intToDoubleDiv + "  - вещественное деление");
        System.out.println();
        System.out.println("Примеры операций с вещественными числами:");
        System.out.println(double1 + " + " + double2 + " = " + doubleAdd);
        System.out.println(double1 + " - " + double2 + " = " + doubleSub);
        System.out.println(double1 + " * " + double2 + " = " + doubleMult);
        System.out.println(double1 + " / " + double2 + " = " + doubleDiv);
    }
}
