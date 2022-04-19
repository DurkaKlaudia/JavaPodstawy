package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad2 {

    public Zad2() {
    }

    public static void main(String[] args) {
        System.out.println("Proszę podać liczbę całkowitą:");
        Scanner liczba = new Scanner(System.in);
        int number = liczba.nextInt();
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

    }
}
