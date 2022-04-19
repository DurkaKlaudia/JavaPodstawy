package tasks;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        int nawias = 0;

        for (char c : text){
            switch (c){
                case '(':
                    nawias++;
                    break;
                case ')':
                    nawias--;
                    break;
            }
            if (nawias < 0){
                break;
            }
        }
        if (nawias != 0){
            System.out.println("Błędne sparowanie nawiasów");
        } else {
            System.out.println("OK");
        }
    }
}

/*
Napisz program, który sprawdza czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako pojedynczy łańcuch znaków.

W przypadku, gdy nawiasy są poprawnie sparowane, program powinien wypisać w konsoli wiadomość: "OK". W przeciwnym przypadku program powinien wypisać w konsoli wiadomość: "Błędne sparowanie nawiasów".

Przykład a: "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))", wynik: "Błędne sparowanie nawiasów"

Przykład b: "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))" wynik: "OK"

Przykład c: ") 2 * 4 (" wynik: "Błędne sparowanie nawiasów"

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
