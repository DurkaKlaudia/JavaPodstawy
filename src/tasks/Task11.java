package tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int j = 0;
        if (number <= 1){
            System.out.println("Przerywam pracę");
        } else {
            for (int i = 1; i <= number; i++){
                if (number % i == 0){
                    j = j + 1;
                }
            }
            if(j == 2){
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }

    }
}

/*
Napisz program, który pobiera od użytkownika liczbę całkowitą większą od 1 i sprawdza czy liczba jest liczbą pierwszą. W przypadku, kiedy liczba ta jest liczbą pierwszą program wypisze w konsoli wiadomość "Tak", w przeciwnym przypadku wypisze w konsoli wiadomość "Nie".

W przypadku, gdy użytkownik poda liczbę mniejszą lub równą 1, program wypisze w konsoli wiadomość: "Przerywam pracę".

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
