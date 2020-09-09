package ru.v_makletsov.lecture_2;

import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов в доме");
        int sectionsAmount = scanner.nextInt();

        System.out.println("Введите количество этажей в доме");
        int floorsAmount = scanner.nextInt();

        System.out.println("Введите номер квартиры");
        int flatNumber = scanner.nextInt();

        int floorFlatsAmount = 4;

        if (sectionsAmount * floorsAmount * floorFlatsAmount < flatNumber) {
            System.out.println("Квартиры с номером " + flatNumber + " нет в доме, проверьте введенные данные");
        } else {
            int sectionNumber = (flatNumber + (floorFlatsAmount * floorsAmount - 1)) / (floorFlatsAmount * floorsAmount);
            int floorNumber = ((flatNumber + (floorFlatsAmount - 1)) / floorFlatsAmount) - (sectionNumber - 1) * floorsAmount;
            int flatIndex = flatNumber % floorFlatsAmount;

            String flatPosition;

            if (flatIndex == 1) {
                flatPosition = "ближняя слева";
            } else if (flatIndex == 2) {
                flatPosition = "дальняя слева";
            } else if (flatIndex == 3) {
                flatPosition = "дальняя справа";
            } else {
                flatPosition = "ближняя справа";
            }

            System.out.println("Квартира находится в " + sectionNumber + " подъезде, на " + floorNumber + " этаже " + flatPosition);
        }
    }
}
