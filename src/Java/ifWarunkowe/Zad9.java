package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad9 {

    public static void main(String[] args) {
        int liczba;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        liczba = wejscie.nextInt();
        if (liczba % 5 == 0 && liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 5 i 3");
        } else if (liczba % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else if (liczba % 5 == 0){
            System.out.println("Liczba jest podzielna przez 5");
        }
        else {
            System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 5");
        }
    }
}
