package tasks;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b){
            int c = b-a;
            int sum = a;
            for (int i = 0; i < c; i++){
                a = a + 1;
                sum = sum + a;
            }
            System.out.println(sum);
        } else {
            System.out.println("Robota skończona");
        }

    }
}

/*
Napisz program, który pobiera od użytkownika dwie liczby całkowite A - a (int) oraz B - b (int), gdzie A < B, a następnie oblicza sumę ciągu liczb od A do B (A, A + 1, A + 2, . . . , B) i wypisuje ją w konsoli. Gdy warunek A < B nie został spełniony, program kończy pracę wypisuąc w konsoli "Robota skończona".

Przykładowo dla A = 4 i B = 11 program powinien wypisać w konsoli liczbę 60.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
