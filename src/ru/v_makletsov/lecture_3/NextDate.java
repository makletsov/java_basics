package ru.v_makletsov.lecture_3;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату");
        System.out.print("День - ");
        int inputDay = scanner.nextInt();

        System.out.print("Месяц - ");
        int inputMonth = scanner.nextInt();

        System.out.print("Год - ");
        int inputYear = scanner.nextInt();

        boolean isCorrectDate = true;
        int monthDaysAmount = 30;

        if ((inputYear < 0) || (inputYear > 9998) || (inputMonth < 1) || (inputMonth > 12) || (inputDay < 1)) {
            isCorrectDate = false;
        } else {
            if (((inputMonth <= 7) && (inputMonth % 2 != 0)) || ((inputMonth > 7) && (inputMonth % 2 == 0))) {
                monthDaysAmount = 31;
            } else if (inputMonth == 2) {
                boolean isLeapYear = ((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0);

                monthDaysAmount = isLeapYear ? 29 : 28;
            }

            if (monthDaysAmount < inputDay) {
                isCorrectDate = false;
            }
        }

        if (!isCorrectDate) {
            System.out.println("Дата введена некорректно");
        } else {
            int resultDay;
            int resultMonth;
            int resultYear;

            if ((inputMonth == 12) && (inputDay == 31)) {
                resultYear = inputYear + 1;
                resultMonth = 1;
                resultDay = 1;
            } else if (monthDaysAmount == inputDay) {
                resultYear = inputYear;
                resultMonth = inputMonth + 1;
                resultDay = 1;
            } else {
                resultYear = inputYear;
                resultMonth = inputMonth;
                resultDay = inputDay + 1;
            }

            System.out.printf("Следующая дата: %02d.%02d.%04d", resultDay, resultMonth, resultYear);
        }
    }
}
