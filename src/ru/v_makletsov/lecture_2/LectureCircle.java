package ru.v_makletsov.lecture_2;

public class LectureCircle {
    public static void main(String[] args) {
        double radius = 15;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Площадь круга с диаметром 15 равна " + circleArea);
        System.out.println();

        double cathet1 = 3;
        double cathet2 = 4;
        double hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));

        System.out.println("Длина гипотенузы прямоугольного триугольника с катетами " + cathet1 + " и " + cathet2 + " равна " + hypotenuse);
        System.out.println();

        double angle0 = Math.toRadians(0);
        double angle90 = Math.toRadians(90);
        double angle180 = Math.toRadians(180);
        double angle270 = Math.toRadians(270);
        double sin0 = Math.sin(angle0);
        double sin90 = Math.sin(angle90);
        double sin180 = Math.sin(angle180);
        double sin270 = Math.sin(angle270);

        System.out.println("Sin 0   = " + sin0);
        System.out.println("Sin 90  = " + sin90);
        System.out.println("Sin 180 = " + sin180); /* Результат этого выражения отличен от 0 потому что число PI - бесконечное
                                                    и не помещается целиком в переменную типа double. Попробовать откорректировать вывод или пока этого достаточно?*/
        System.out.println("Sin 270  = " + sin270);
        System.out.println();
    }
}
