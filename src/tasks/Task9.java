package tasks;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            n = scanner.nextInt();
            if (n > max){
                max = n;
            }

            if (n < min){
                min = n;
            }
        } while (n != 0);

        System.out.println(max + min);
        System.out.println((max + min) / 2.0f);

    }
}

/*
Napisz program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie danych kończone jest podaniem liczby 0 (nie wliczana do danych). Następnie, program oblicza sumę największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną i wypisuje je w konsoli.

Przykładowo dla ciągu podawanych liczb: 1, -4, 2, 17, 0, program powinien wypisać w konsoli liczby: 13, 6.5.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
