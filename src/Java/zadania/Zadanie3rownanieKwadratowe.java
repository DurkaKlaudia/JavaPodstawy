package Java.zadania;

import java.util.Scanner;

public class Zadanie3rownanieKwadratowe {

    private static Scanner scanner;

    public Zadanie3rownanieKwadratowe() {
    }

    public static void main(String[] args) {
        System.out.println("enter a:");
        int a = scanner.nextInt();
        System.out.println("enter b:");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();
        rownanieKwadratowe(a, b, c);
    }

    public static void rownanieKwadratowe(int a, int b, int c) {
        double delta = (double)(b * b - 4 * a * c);
        double x1;
        if (delta > 0.0D) {
            x1 = ((double)(-b) - Math.sqrt(delta)) / 2.0D * (double)a;
            double x2 = ((double)(-b) + Math.sqrt(delta)) / 2.0D * (double)a;
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (delta == 0.0D) {
            x1 = (double)(-b / 2 * a);
            System.out.println("x = " + x1);
        } else {
            System.out.println("delta ujemna");
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
