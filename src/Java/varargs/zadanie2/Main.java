package Java.varargs.zadanie2;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Zad2.usunElement(4, new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public static void varArgsPrzyklad(int... a) {
        int[] var1 = a;
        int var2 = a.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int elemet = var1[var3];
            System.out.println(elemet);
        }

        System.out.println(a[1]);
    }
}
