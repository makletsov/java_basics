package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class TemperatureConversion {
    /* • Написать программу, которая переводит температуру из градусов Цельсия в градусы Кельвина и Фаренгейта
       • Прочитать число – температуру в шкале Цельсия и напечатать две строки – в градусах Кельвина и Фаренгейта
       • Перевод градусов Цельсия в градусы Кельвина и перевод в градусы Фаренгейта оформить отдельными функциями
       • Формулы найти в интернете */
    private static double convertCelsiusToFahrenheit(double celsiusDegrees) {
        return (celsiusDegrees * 9 / 5) + 32;
    }

    private static double convertCelsiusToKelvin(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение температуры в градусах Цельсия:");
        double inputDegrees = scanner.nextDouble();

        System.out.printf("В градусах Кельвина - %.2f%n", convertCelsiusToKelvin(inputDegrees));
        System.out.printf("В градусах Фаренгейта - %.2f", convertCelsiusToFahrenheit(inputDegrees));
    }
}
