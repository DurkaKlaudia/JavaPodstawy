package tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        float weight = scanner.nextFloat();

        if (height > 150 && weight <= 180){
            System.out.println("Zapnij pasy!");
        } else {
            System.out.println("Przykro mi, nie możesz jechać!");
        }
    }
}

/*
Napisz program, który na podstawie zmiennych: wzrost - height (int) oraz waga - weight (float), sprawdza czy dana osoba może jechać kolejką górską.

W przypadku kiedy osoba jest wyższa niż 150cm oraz nie przekracza wagi 180kg, program wypisze w konsoli "Zapnij pasy!", w przeciwnym wypadku wypisze w konsoli "Przykro mi, nie możesz jechać!".

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
