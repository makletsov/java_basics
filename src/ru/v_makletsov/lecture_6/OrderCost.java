package ru.v_makletsov.lecture_6;

import java.util.Scanner;

public class OrderCost {
    /* • Написать функцию для расчета стоимости заказа с учетом скидок
       • Всего есть два вида товаров, в заказ может входить некоторое количество товаров одного типа и другого типа
       • Скидка 5% начисляется, если суммарное количество товаров в заказе не меньше 10
       • Скидка 5% начисляется, если суммарная стоимость заказа не меньше 1000 рублей
       • Если выполняются оба условия, то скидка 10% от начальной стоимости */
    private static double getOrderCost(int product1Amount, double product1Cost, int product2Amount, double product2Cost) {
        int totalAmount = product1Amount + product2Amount;
        double totalCost = product1Cost * product1Amount + product2Cost * product2Amount;

        double enoughAmountDiscount = (totalAmount >= 10) ? 0.05 : 0;
        double enoughCostDiscount = (totalCost >= 1000) ? 0.05 : 0;

        return totalCost * (1 - enoughAmountDiscount - enoughCostDiscount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int awlCost = 10;

        System.out.printf("Шило стоит %dр. Введите необходимое количество шила:%n", awlCost);
        int awlAmount = scanner.nextInt();

        final int soapCost = 10;

        System.out.printf("Мыло стоит %dр. Введите необходимое количество мыла:%n", soapCost);
        int soapAmount = scanner.nextInt();

        double orderCost = getOrderCost(awlAmount, awlCost, soapAmount, soapCost);

        System.out.printf("Ваш заказ: %dшт. шила и %dшт. мыла.%n", awlAmount, soapAmount);
        System.out.printf("Стоимость заказа: %.2fруб.%n", orderCost);
    }
}
