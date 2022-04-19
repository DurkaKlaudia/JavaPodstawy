package tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        while (value != 0){
            sum += value;
            value = scanner.nextInt();
        }
        System.out.println(sum);
    }
}

/*
Napisz program, który pobiera od użytkownika liczby tak długo, jak nie zostanie podana liczba 0. Gdy zostanie podana liczba 0, program oblicza sumę podanych liczb i wypisuje ją w konsoli.

Przykładowo dla ciągu podawanych liczb: 3, 2, 5, 1, 0, program powinien wypisać w konsoli liczbę 11.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
