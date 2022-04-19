package tasks;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int a = 1;
        System.out.println(a);

        for (int i = 0; i < n; i++){
            if (a < n) {
                a = a * 2;
                if (a < n) {
                    System.out.println(a);
                }
            }
        }
    }
}

/*
Napisz program, który pobiera od użytkownika liczbę całkowita dodatnią N - n (int), a następnie wyświetla w konsoli wszystkie potęgi liczby 2 nie większe, niż podana liczba (każda liczba w kolejnej linii).

Przykładowo dla liczby 71 program powinien wypisać w konsoli liczby: 1 2 4 8 16 32 64, każda w nowej linijce.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
