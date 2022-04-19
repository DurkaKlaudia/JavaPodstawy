package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }
}
