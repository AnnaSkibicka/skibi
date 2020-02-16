package sda.Skibilandia;

public class Recursive {
    public static void main(String[] args) {
        int n = 20;
        int r = silnia(n);
        System.out.println(n + "! - " + r);
        System.out.println("fib(n) = " + r);
    }

    public static int silnia(int n) {
        if (n == 0) return 1;
        return n * silnia(n - 1);
    }

    public static int fibbonaci(int n) {
        if (n == 0 || n == 1) return n;
        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }

//    public static int[] find2Min(int[] tab) {
//        int tab[][] = new int[2][4];
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i >= 0; i++) {
//
//        }
//    }
}
