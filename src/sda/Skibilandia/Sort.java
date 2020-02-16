package sda.Skibilandia;

import java.util.Random;
import java.util.Scanner;

import static sda.Skibilandia.Wall.printTab;

public class Sort {

    public static final int SIZE = 100000;

    public static void main(String[] args) {

        Random ran = new Random();
        int tab[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            tab[i] = ran.nextInt();
        }
//        //printTab(tab);
//        long t1 = System.currentTimeMillis();
//        BubbleSort(tab);
//        long t2 = System.currentTimeMillis();
//        printTab(tab);
//        System.out.println("Czas sortowania: " + (t2- t1) + " ms");


        long t1 = System.currentTimeMillis();
        SelectionSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas sortowania: " + (t2 - t1) + " ms");
    }
    public static void BubbleSort(int[] tab) {
        int temp;
        for (int i = 0; i < tab.length -1 ; i++) {
            for (int j = 0; j < tab.length -1 ; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }

        }
    }
    public static void SelectionSort (int[] tab) {
        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if(tab[j] < tab[pmin]) pmin = j;

            }
                temp = tab[pmin];
                tab[pmin] = tab[i];
                tab[i] = temp;
            }

        }
    }

