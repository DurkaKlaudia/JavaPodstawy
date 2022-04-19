package tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.print(text.replaceAll(",", "-MAKARENA"));
    }
}

/*
Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a nastepnie dla tego tekstu zamienia wszystkie wystąpienia przecinków na tekst “-MAKARENA” i wyświetla w konsoli.

Przykładowo dla tekstu "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", program powinien wypisać w konsoli "Lorem ipsum dolor sit amet-MAKARENA consectetur adipiscing elit-MAKARENA sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
