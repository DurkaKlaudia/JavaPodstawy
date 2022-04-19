package Java.varargs.zadanie2;

public class Zad2 {

    public Zad2() {
    }

    public static void usunElement(int poz, int... a) {
        for(int i = poz; i < a.length - 1; ++i) {
            a[i] = a[i + 1];
        }

        int[] var6 = a;
        int var3 = a.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var6[var4];
            System.out.println(element);
        }

    }
}
