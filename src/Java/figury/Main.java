package Java.figury;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj figure:");
        Scanner input = new Scanner(System.in);
        String figura = input.next();
        double a;
        if (figura.equals("kolo")) {
            System.out.println("podaj promien");
            a = input.nextDouble();
            Kolo koło = new Kolo(a);
            System.out.println("wymiary kola");
            System.out.println("obwod: " + Kalkulator.obliczObwod(koło));
            System.out.println("pole: " + Kalkulator.obliczPole(koło));
        } else {
            double b;
            if (figura.equals("prostokat")) {
                System.out.println("podaj boki:");
                a = input.nextDouble();
                b = input.nextDouble();
                Prostokat prostokąt = new Prostokat(a, b);
                System.out.println("wymiary prostokata: ");
                System.out.println("obwod: " + Kalkulator.obliczObwod(prostokąt));
                System.out.println("pole: " + Kalkulator.obliczPole(prostokąt));
            } else if (figura.equals("trojkat")) {
                System.out.println("podaj boki:");
                a = input.nextDouble();
                b = input.nextDouble();
                double c = input.nextDouble();
                Trojkat trójkąt = new Trojkat(a, b, c);
                System.out.println("Boki trojkata: ");
                System.out.println("pole: " + Kalkulator.obliczPole(trójkąt));
                System.out.println("obwod: " + Kalkulator.obliczObwod(trójkąt));
            } else {
                System.out.println("Nie ma takiej figury!");
            }
        }

    }
}
