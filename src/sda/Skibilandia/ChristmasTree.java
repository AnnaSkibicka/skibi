package sda.Skibilandia;

public class ChristmasTree {
    public static void main(String[] args) {
        createTree(5);
    }
    private static void createTree(int H) {
        int width = 2 * H - 1;
        //pętla rysująca trójkąt
        for (int i = 1; i <= H; i++) {
            for (int j = 0; j < (width - (2 * i - 1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        //rysowanie prostokąta
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}