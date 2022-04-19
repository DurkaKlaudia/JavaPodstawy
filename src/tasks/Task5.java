package tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

/*
Napisz program, który pobiera od użytkownika liczbę całkowitą dodatnią - number (int), a następnie wypisuje w konsoli kolejno wszystkie dodatnie liczby niepatrzyste nie większe od podanej liczby (każda w kolejnej linii).

Przykładowo dla liczby 15 program powinien wypisać w konsoli liczby w osobnych liniach: 1, 3, 5, 7, 9, 11, 13, 15.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */