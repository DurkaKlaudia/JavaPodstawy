package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad3 {

    public Zad3() {
    }

    public static void main(String[] args) {
        System.out.println("Proszę podać liczbę:");
        Scanner liczba = new Scanner(System.in);
        int number = liczba.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 3 i przez 5");
        } else if (number % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else if (number % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3, ani przerz 5");
        }

    }
}
