package ru.v_makletsov.lecture_2;

public class Support {
    public static void main(String[] args) {
        int flatNumber = 40;
        int floorsAmount = 5;

        int sectionNumber = (flatNumber + (4 * floorsAmount - 1)) / (4 * floorsAmount);
        int floorNumber = ((flatNumber + 3) / 4) - (sectionNumber - 1) * floorsAmount;
        int flatIndex = flatNumber - 4 * floorsAmount * (sectionNumber - 1) - 4 * (floorNumber - 1) ;

        System.out.println("Подъезд - " + sectionNumber);
        System.out.println("Этаж    - " + floorNumber);
        System.out.println("Индекс  - " + flatIndex);
    }
}
