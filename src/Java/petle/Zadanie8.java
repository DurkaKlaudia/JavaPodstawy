package Java.petle;

import java.util.Scanner;

public class Zadanie8 {

    public Zadanie8() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for(int i = 0; i <= 5; ++i) {
            int liczba = sc.nextInt();
            suma += liczba;
        }

        if (suma != 0) {
            System.out.println("Suma tych liczb to: " + suma);
        }
    }
}
