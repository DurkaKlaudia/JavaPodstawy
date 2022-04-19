package Java.zadania;

import java.util.Scanner;

public class Zadanie4PifPaf {

    public Zadanie4PifPaf() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę naturalną:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        pifpaf(a);
    }

    private static void pifpaf(int a) {
        for(int i = 1; i <= a; ++i) {
            if (i % 21 == 0) {
                System.out.println("pif paf");
            } else if (i % 3 == 0) {
                System.out.println("pif");
            } else if (i % 7 == 0) {
                System.out.println("paf");
            } else {
                System.out.println(i);
            }
        }

    }
}
