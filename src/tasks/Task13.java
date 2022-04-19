package tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (text.contains("Java")){
            System.out.println("Znalazłem Java");
        }

        if (text.substring(0,4).equals("Java")){
            System.out.println("Zaczyna się od Java");
        }

        if (text.endsWith("Java")){
            System.out.println("Kończy się na Java");
        }

        if (text.equals("Java")){
            System.out.println("Równa się Java");
        }

        System.out.print(text.indexOf("Java"));
    }
}

/*
Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a nastepnie:

sprawdza czy w tekście występuje słowo "Java" - jeżeli tak, wypisuje w konsoli wiadomość "Znalazłem Java",
sprawdza czy tekst zaczyna się od słowa "Java" - jeżeli tak, wypisuje w konsoli wiadomość "Zaczyna się od Java",
sprawdza czy tekst kończy się słowem "Java" - jeżeli tak, wypisuje w konsoli wiadomość "Kończy się na Java",
sprawdza czy tekst równa się słowu "Java" - jeżeli tak, wypisuje w konsoli wiadomość "Równa się Java",
wypisuje w konsoli indeks pierwszego wystąpienia słowa "Java" w tekście.
Przykładowo dla tekstu "Java", program powinien wypisać w konsoli:

Znalazłem Java
Zaczyna się od Java
Kończy się na Java
Równa się Java
0
a dla tekstu "Kurs java od podstaw to najlepsza droga do poznania Java", program powinien wypisać w konsoli:

Znalazłem Java
Kończy się na Java
52
Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */