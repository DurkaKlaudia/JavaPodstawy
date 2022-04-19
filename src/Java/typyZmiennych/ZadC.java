package Java.typyZmiennych;

import java.util.Scanner;

public class ZadC {

    public ZadC() {
    }

    public static void main(String[] args) {
        System.out.println("Proszę podać wzrost metrach:");
        Scanner m = new Scanner(System.in);
        double wzrost = m.nextDouble();
        System.out.println("Proszę podać wagę w kilogramach:");
        Scanner kg = new Scanner(System.in);
        double waga = kg.nextDouble();
        System.out.println("Twoje BMI wynosi:");
        double BMI = waga / (wzrost * wzrost);
        System.out.println(BMI);
    }
}
