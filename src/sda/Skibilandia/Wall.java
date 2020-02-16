package sda.Skibilandia;

import java.util.Random;
import java.util.Scanner;

public class Wall {

    public static final int SIZE = 100;

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int tab[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            tab[i] = ran.nextInt(SIZE);
        }
        printTab(tab);
        PrintReverse(tab);
        dzielonko(tab);
        sumN(tab, 5);
        System.out.println("\nSuma 5 el. = " + sumN(tab, 5));
        int r = sumNback(tab, 5, 500);
        System.out.println("\nSuma 5 el. = " + sumNback(tab, 5, 8));
        number(tab, 1000);
        System.out.println(number(tab, 2));

//        System.out.println("Podaj dzielnik: ");
//        int divider = scan.nextInt();
//        printModN(tab, divider);
        int[] t = find2Min(tab);
       System.out.println("2 min el:  (" + tab[t[0]] + ", " + tab[t[1]] + ")");
    }

    public static void printModN(int[] tab, int divider) {
    }

    public static int sumN(int[] tab, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += tab[i];
        }
        return result;
    }

    public static void dzielonko(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0)
                System.out.print(tab[i] + " ");
        }

    }

    public static void printTab(int[] tab) {
        int i;
        for (i = 0; i < tab.length - 1; i++) {
            System.out.printf(tab[i] + ", ");

        }
        System.out.println(tab[i]);
        System.out.println();
    }

    public static void PrintReverse(int[] tab) {
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static int sumNback(int[] tab, int n, int m) {
        int result = 0;
        for (int i = tab.length - 1; i > tab.length - 1 - n; i--) {
            if (tab[i] > m) result += tab[i];
        }
        return result;
    }

    public static int number(int[] tab, int n) {
        int num = 0;
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result += tab[i];
            num++;
            if (result >= n) break;
        }
        return num;
    }

    public static int[] find2Min(int[] tab) {
        int p1, p2, temp;
        p1 = 0;
        p2 = 1;

        if (tab[p1] > tab[p2]) {
            p1 = 1;
            p2 = 0;
        }
        int i = 2;
        while (i < tab.length) {
                if(tab[i] < tab[p2]) {
                    p2 = i;
                    if (tab[p1] > tab[p2]) {
                        temp = p1;
                        p1 = p2;
                        p2 = temp;
                    }
                }
                i++;
        }
        int[] t = new int[2];
        t[0] = p1;
        t[1] = p2;
        return t;
    }
}
