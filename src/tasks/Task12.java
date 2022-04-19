package tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] tab = new int[10];

        for (int i = 0; i < numbers.length; i++){
            tab[numbers[i] - 1] += 1;
        }

        for (int i = 0; i < tab.length; i++){
            System.out.println(i + 1 + " - " + tab[i]);
        }
    }
}

/*
Napisz program, który zlicza ile razy wystąpiła każda z liczb w przygotowanej tablicy i wypisuje podsumowanie w konsoli. Tablica może zawierać tylko liczby od 1 do 10.

Przykładowo dla tablicy [6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7], program powinien wypisać w konsoli ilość wystąpień każdej liczby:

1 - 1
2 - 1
3 - 3
4 - 3
5 - 3
6 - 4
7 - 1
8 - 2
9 - 0
10 - 2
Tablica zawierająca liczby przygotowana jest jako zmienna numbers.
 */
