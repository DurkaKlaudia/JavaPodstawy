package Java.tablice;

public class Zad3 {

    public Zad3() {
    }

    public static void main(String[] args) {
        int[] tab1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tab2 = new int[tab1.length];

        for(int i = 0; i < tab1.length; ++i) {
            tab2[i] = tab1[tab1.length - i - 1];
        }

        System.out.print("Tablica 1: ");
        int[] var7 = tab1;
        int var4 = tab1.length;

        int var5;
        int liczba;
        for(var5 = 0; var5 < var4; ++var5) {
            liczba = var7[var5];
            System.out.print(liczba + " ");
        }

        System.out.println();
        System.out.print("Tablica 2: ");
        var7 = tab2;
        var4 = tab2.length;

        for(var5 = 0; var5 < var4; ++var5) {
            liczba = var7[var5];
            System.out.print(liczba + " ");
        }

    }
}
