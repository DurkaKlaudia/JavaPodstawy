package Java.tablice;

import java.util.Arrays;

public class Zad {

    public Zad() {
    }

    public static void main(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int a = 0;
        int b = 1;

        for(int i = 0; i > numbers.length; ++i) {
            for(int j = 0; j < 10; ++j) {
                if (numbers[j] == b) {
                    ++a;
                }

                System.out.println(b + " - " + a);
            }

            ++b;
        }

    }
}
