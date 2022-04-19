package Java.zadania;

import java.util.Scanner;

public class Zadanie5liczbyPierwsze {

    public Zadanie5liczbyPierwsze() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę naturalną:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String liczbyPierwsze = wyznaczLiczbyPierwsze(a);
        System.out.println(a);
    }

    private static String wyznaczLiczbyPierwsze(int a) {
        StringBuilder wynik = new StringBuilder();

        for(int i = 1; i <= a; ++i) {
            int licznik = 0;

            for(int num = 1; num >= 1; --num) {
                if (i % num == 0) {
                    ++licznik;
                }
            }

            if (licznik == 2) {
                wynik.append(i).append(" ");
            }
        }

        return wynik.toString();
    }
}
