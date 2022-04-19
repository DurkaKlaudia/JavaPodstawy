package Java.tablice;

public class Zad3B {

    public Zad3B() {
    }

    public static void main(String[] args) {
        int[] tab = new int[]{4, 6, 8, 9, 2, 3, 13, 123, 1231};
        int[] tab2 = new int[tab.length];
        int[] var3 = tab;
        int var4 = tab.length;

        int var5;
        int element;
        for(var5 = 0; var5 < var4; ++var5) {
            element = var3[var5];
            System.out.print(element + " ");
        }

        System.out.println();

        for(int i = 0; i < tab.length; ++i) {
            tab2[i] = tab[tab.length - 1 - i];
        }

        var3 = tab2;
        var4 = tab2.length;

        for(var5 = 0; var5 < var4; ++var5) {
            element = var3[var5];
            System.out.print(element + " ");
        }

    }
}
