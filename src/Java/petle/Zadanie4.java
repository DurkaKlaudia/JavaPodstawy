package Java.petle;

import java.util.Scanner;

public class Zadanie4 {
    public Zadanie4() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 1;

        for(int i = 1; i <= a; ++i) {
            b *= i;
        }

        System.out.println("Silnia z tej liczby wynosi: " + b);
    }

}
