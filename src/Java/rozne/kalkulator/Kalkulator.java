package Java.rozne.kalkulator;

import java.util.Scanner;

public class Kalkulator {

    private static String znak;
    private static double a;
    private static double b;

    private static double dodawanie(){
        return a + b;
    }

    private static double odejmowanie(){
        return a - b;
    }

    private static double mnozenie(){
        return a * b;
    }

    private static double dzielenie(){
        return a / b;
    }

    private static double modulo(){
        return a % b;
    }

    private static double oblicz(){
        double wynik;
        switch (znak){
            case "+": {
                wynik = dodawanie();
                break;
            }
            case "-": {
                wynik = odejmowanie();
                break;
            }
            case "*": {
                wynik = mnozenie();
                break;
            }
            case  "/": {
                wynik = dzielenie();
                break;
            }
            case "%": {
                wynik = modulo();
                break;
            }
            default: {
                wynik = -6843927;
                System.out.println("wrong sign");
            }
        }
        return wynik;
    }

    private static void zczytajDane(){
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("A teraz podaj znak: ");

        Kalkulator.znak = input.next();
    }

    private static void drukujDane(){
        System.out.println("dokonuje obliczen");
        System.out.println(oblicz());
        System.out.println("Gratulacje! pozdrawiam.");
    }

    public static void kalkulatorMethod(){
        zczytajDane();
        drukujDane();
    }
}
