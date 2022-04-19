package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad8 {

    public Zad8() {
    }

    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double pierwsza_liczba = (double)wej.nextInt();
        System.out.println("Podaj drugą liczbę:");
        double druga_liczba = (double)wej.nextInt();
        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");
        System.out.println("Potęgowanie dwóch liczb - wciśnij ^");
        System.out.println("Pierwiastkowanie dwóch liczb - wciśnij $");
        char znak = wej.next().charAt(0);
        switch(znak) {
            case '$':
                System.out.println(Math.pow(pierwsza_liczba, 1.0D / druga_liczba));
                break;
            case '*':
                System.out.println(pierwsza_liczba * druga_liczba);
                break;
            case '+':
                System.out.println(pierwsza_liczba + druga_liczba);
                break;
            case '-':
                System.out.println(pierwsza_liczba - druga_liczba);
                break;
            case '/':
                if (druga_liczba != 0.0D) {
                    System.out.println(pierwsza_liczba / druga_liczba);
                } else {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            case '^':
                System.out.println(Math.pow(pierwsza_liczba, druga_liczba));
        }

    }
}
