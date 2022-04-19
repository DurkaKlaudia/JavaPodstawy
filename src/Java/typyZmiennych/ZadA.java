package Java.typyZmiennych;

import java.util.Scanner;

public class ZadA {

    public ZadA() {
    }

    public static void main(String[] args) {
        System.out.println("Proszę podać liczbę");
        Scanner centymetry = new Scanner(System.in);
        double cm = centymetry.nextDouble();
        System.out.println("Podana długość w centymetrach w przeliczeniu na cale wynosi:");
        double inch = cm / 2.54D;
        System.out.println(inch);
    }
}
