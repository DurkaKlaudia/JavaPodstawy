package tasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String reserved = new StringBuilder(text).reverse().toString();

        System.out.println(reserved);
    }
}

/*
Napisz program, który przyjmuje od użytkownika tekst, a następnie tworzy łańcuch będący odwróceniem podanego tekstu i wyświetla go w konsoli.

Przykładowo dla tekstu "Kot", program powinien wypisać w konsoli tekst "toK".

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
