package ru.v_makletsov.lecture_2;

public class HomeworkCircle {
    public static void main(String[] args) {
        /* Задача на вычисление площади круга и длины окружности по заданному радиусу
         *  Программа определяет лощадь круга и длину окружности с заданным радиусом.
         *  Значение радиуса задать самим в тексте программы */

        double circleRadius = 5;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double circleLength = 2 * Math.PI * circleRadius;

        System.out.println("Площадь круга радиусом " + circleRadius + " равна " + circleArea);
        System.out.println("Длина окружности радиусом " + circleRadius + " равна " + circleLength);
        System.out.println();

        /* Задача на вычисление радиуса окружности по заданной площади круга
         *  Посчитать радиус окружности с заданной площадью круга.
         *  Значение площади задать самим в тексте программы*/

        circleArea = 100;
        circleRadius = Math.sqrt(circleArea / Math.PI);

        System.out.println("Радиус окружности, при величине площади круга равной " + circleArea + ", равен " + circleRadius);
        System.out.println();

        /* Задача на определение площади сектора по заданному углу и радиусу
         *  Посчитать площадь сектора с заданными радиусом и углом в градусах.
         *  Значения радиуса и угла задать в тексте программы*/

        double sectorAngle = 45;          //угол сектора задаем в градусах
        double sectorRadius = 50;
        double sectorArea = (Math.toRadians(sectorAngle) / 2) * Math.pow(sectorRadius, 2);

        System.out.println("Площадь сектора радиусом " + sectorRadius + " при величине угла " + sectorAngle + " градусов, равна " + sectorArea);
    }
}
