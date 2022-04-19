package Java.petle;

import java.util.Scanner;

public class Zadanie12 {

    public Zadanie12() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        boolean var3 = true;

        int liczba;
        do {
            liczba = sc.nextInt();
            suma += liczba;
        } while(liczba != 0);

        System.out.println("Suma tych liczb to: " + suma);
    }
}
