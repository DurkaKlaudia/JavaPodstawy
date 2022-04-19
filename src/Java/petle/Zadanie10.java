package Java.petle;

import java.util.Scanner;

public class Zadanie10 {

    public Zadanie10() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for(int liczba = 1; liczba != 0; suma += liczba) {
            liczba = sc.nextInt();
        }

        System.out.println("Suma tych liczb to: " + suma);
    }
}
