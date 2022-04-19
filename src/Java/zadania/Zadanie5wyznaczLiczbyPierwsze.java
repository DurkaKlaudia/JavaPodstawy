package Java.zadania;

import java.util.Scanner;

public class Zadanie5wyznaczLiczbyPierwsze {

    public Zadanie5wyznaczLiczbyPierwsze() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj dowolna liczbe naturalna: ");
        int a = input.nextInt();
        String liczbyPierwsze = wyznaczLiczbyPierwsze(a);
        System.out.printf(liczbyPierwsze);
    }

    private static String wyznaczLiczbyPierwsze(int a) {
        StringBuilder wynik = new StringBuilder();

        for(int i = 1; i <= a; ++i) {
            int num = 0;

            for(int j = i; j >= 1; --j) {
                if (i % j == 0) {
                    ++num;
                }
            }

            if (num == 2) {
                wynik.append(i).append(" ");
            }
        }

        return wynik.toString();
    }
}
