package sda.Skibilandia;

import java.util.Random;

public class Tab {
    public static void main(String[] args) {
        Random ran = new Random();
        int tab[][] = new int[5][6];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
            tab[i][j] = 50 + ran.nextInt(50);
            }
        }
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*Metoda: transpozycja tablicy (zamienia kolumne na wiersz)
    public static void createTab(int[][] tab) {*/

}
