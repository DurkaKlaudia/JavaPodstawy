package Java.varargs.zadanie3;

public class Zad3 {

    public Zad3() {
    }

    public static void roznicaMinMax(int... a) {
        int min = a[0];
        int max = a[0];

        for(int i = 1; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max - min);
    }
}
