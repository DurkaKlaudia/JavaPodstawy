package Java.typyZmiennych;

import java.util.Scanner;

public class ZadD {
    public ZadD() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać dystans w metrach:");
        double dystans = input.nextDouble();
        System.out.println("Proszę podać pełne godziny:");
        int godziny = input.nextInt();
        System.out.println("Proszę podać pełne minuty:");
        int minuty = input.nextInt();
        System.out.println("Proszę podać sekundy:");
        int sekundy = input.nextInt();
        int suma_sekund = godziny * 3600 + minuty * 60 + sekundy;
        double suma_godzin = (double)(godziny + minuty / 60 + sekundy / 3600);
        double mile = dystans / 1609.0D;
        double metry_na_sekunde = dystans / (double)suma_sekund;
        double metry_na_godzine = dystans / suma_godzin;
        double mile_na_godzine = mile / suma_godzin;
        System.out.println("predkosc w metrach na seksunde to: " + metry_na_sekunde);
        System.out.println("predkosc w metrach na godzine to: " + metry_na_godzine);
        System.out.println("predkosc w milach na godzine to: " + mile_na_godzine);
    }

}
