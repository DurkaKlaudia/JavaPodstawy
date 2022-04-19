package Java.tablice;

import java.util.Arrays;
import java.util.Random;

public class Zad5MaxMin {

    public Zad5MaxMin() {
    }

    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for(int i = 0; i < tablica.length; ++i) {
            tablica[i] = rand.nextInt(100);
        }

        int[] var7 = tablica;
        int var4 = tablica.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int liczba = var7[var5];
            System.out.println(liczba);
        }

        maxMin(tablica);
    }

    public static void maxMin(int[] tablica) {
        Arrays.sort(tablica);
        System.out.println("Max: " + tablica[tablica.length - 1]);
        System.out.println("Min: " + tablica[0]);
        System.out.println("Drugi Max: " + tablica[tablica.length - 2]);
    }
}
