package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {
        // pobieramy 3 boki
        // porównujemy je ze sobą i sprawdzamy czy da sie z nich zlozyc trojkat
        // trojkat da sie zlozyc gdy suma dowolnych 2 bokow jest wieksza niz trzeci bok

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z tych boków da się zbudować trójkąt");
        } else {
            System.out.println("Z tych boków nie da się zbudować trójkąta");

        }
    }
}
