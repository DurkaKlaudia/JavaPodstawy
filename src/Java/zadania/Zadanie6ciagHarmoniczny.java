package Java.zadania;

import java.util.Scanner;

public class Zadanie6ciagHarmoniczny {

    public Zadanie6ciagHarmoniczny() {
    }

    public static void main(String[] args) {
        System.out.println("Enter natural number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double sum = 1.0D;

        for(double i = 2.0D; i <= (double)a; ++i) {
            double b = 1.0D / i;
            sum += b;
        }

        System.out.println(sum);
    }
}
