package Java.petle;

import java.util.Scanner;

public class Zadanie3 {

    public Zadanie3() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i = 0; i <= a; ++i) {
            System.out.println("Aktualna wartość: " + i);
        }

        System.out.println("Koniec Petli");
    }
}
