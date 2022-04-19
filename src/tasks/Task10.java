package tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }

    }
}

/*
Napisz program, który pobiera od użytkownika liczbę całkowitą i wypisuje w konsoli wszystkie jej dzielniki w kolejnych liniach.

Przykładowo dla liczby 21, program powinien wypisać w konsoli liczby: 1, 3, 7, 21, każda w nowej lini.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */