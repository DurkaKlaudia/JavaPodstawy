package Java.zadania;

import java.util.Scanner;

public class Zadanie1ObwodKola {

    public Zadanie1ObwodKola() {
    }

    public static void main(String[] args) {
        System.out.println("podaj srednice kola");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Obwod kola wynosi: " + 3.141592653589793D * (double)a);
    }
}
