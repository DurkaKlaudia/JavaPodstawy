package Java.tablice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public Zad1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int suma = 0;
        boolean mediana = false;
        int size = sc.nextInt();
        int[] tab1 = new int[size];

        for(int i = 0; i < tab1.length; ++i) {
            tab1[i] = rand.nextInt(100);
        }

        Arrays.sort(tab1);
        int[] var12 = tab1;
        int var8 = tab1.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            int liczba = var12[var9];
            System.out.print(liczba + ", ");
            suma += liczba;
        }

        System.out.println();
        int medianaa;
        if (tab1.length % 2 != 0) {
            medianaa = tab1[tab1.length / 2];
        } else {
            medianaa = (tab1[tab1.length / 2] + tab1[tab1.length / 2 + 1]) / 2;
        }

        System.out.println("suma = " + suma);
        System.out.println("Średnia = " + suma / tab1.length);
        System.out.println("Mediana" + mediana);
    }
}