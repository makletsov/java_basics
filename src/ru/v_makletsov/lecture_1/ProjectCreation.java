package ru.v_makletsov.lecture_1;

//import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] =(int) Math.sqrt(i);
        }


        /*long a = 111111111111L;
        double f = a;
        long b = 11111L;
        double d = b;
        System.out.println( a == (long) f);
        System.out.println( b == (long) d);*/

        /*num:
        for (int num = 2; num <= 100; num++) {
            int n = (int)Math.sqrt(num) + 1;
            while (--n != 1) {
                if (num%n==0) {
                    continue num;
                }
            }
            System.out.print(num+" ");
        }*/

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isWhitespace(inputString.charAt(i))) {
                outputString += inputString.charAt(i);
            }
        }

        System.out.println(outputString);*/

        //System.out.println('\n'+'\r');

        /*System.out.println(s2.replace('2', '3'));

        System.out.println(s1);
        System.out.println(s2);*/

        /*int x = 5;
        int y = 7;

        x = 2 * x + y - 3;
        System.out.println("x = " + x);*/
    }
}
