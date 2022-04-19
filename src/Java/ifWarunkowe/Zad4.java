package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad4 {

    public Zad4() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj trzy długości odcinków:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z tych odcinków da się zbudować trójkąt");
        } else {
            System.out.println("Z tych odcinków nie da się zbudować trójkąta");
        }

    }
}
