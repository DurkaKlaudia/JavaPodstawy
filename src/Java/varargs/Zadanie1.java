package Java.varargs;

public class Zadanie1 {

    public Zadanie1() {
    }

    public static void main(String[] args) {
        varArgsPrzyklad(1, 2, 4, 5, 3, 12, 542, 5432, -1, 32);
    }

    public static void varArgsPrzyklad(int... a) {
        int[] var1 = a;
        int var2 = a.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int elemet = var1[var3];
            System.out.println(elemet);
        }

        System.out.println();
        System.out.println(a[1]);
    }
}
