import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tab1 = new double[5];
        tab1[0] = 1.21;
        tab1[1] = 2.98;
        tab1[2] = 3.1451;
        tab1[3] = 4.0123;
        tab1[4] = 5.1207;

        System.out.println("Tablica ma " + tab1.length + " elementów"); // liczenie elementów tablicy

        System.out.println("Tablica 1:");
        for (int i = 0; i< tab1.length; i++){
            System.out.println(tab1[i] + " ");
        }



    }
}
