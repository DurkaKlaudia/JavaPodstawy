package Java.petle;

import java.util.Scanner;

public class Zadanie6 {
    public Zadanie6() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i) {
            System.out.println("Podaj nazwę produktu:");
            Scanner input = new Scanner(System.in);
            String a = input.next();
            System.out.println("dodano " + a);
        }
    }
}
