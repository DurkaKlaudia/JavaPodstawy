package tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amout = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        int numberOfInstallments = scanner.nextInt();

        if (amout > 10000 || amout < 100){
            amout = 5000;
        }

        if (numberOfInstallments > 48 || numberOfInstallments < 6) {
            numberOfInstallments = 36;
        }

        if (numberOfInstallments < 13 && numberOfInstallments > 5){
            System.out.println((amout / numberOfInstallments) + ((amout / numberOfInstallments) * 0.025) );
        } else if (numberOfInstallments < 25 && numberOfInstallments > 12){
            System.out.println((amout / numberOfInstallments) + ((amout / numberOfInstallments) * 0.05));
        } else {
            System.out.println((amout / numberOfInstallments) + ((amout / numberOfInstallments) * 0.1));
        }
    }
}

/*
Napisz program, który na podstawie zmiennych: kwota - amount (double) oraz ilośc rat - numberOfInstallments (int), obliczał będzie miesięczną kwote raty pożyczki i wypisywał ją w konsoli. Parametry posiadają ograniczenia:

kwota pożyczki musi mieścić się w przedziale od 100,00zł do 10.000,00zł,
liczba rat musi mieścić się w przedziale od 6 do 48.
W przypadku wykroczenia kwoty pożyczki poza akceptowalny przedział, kwota pożyczki powinna być ustawiona na 5.000,00zł. W przypadku wykroczenia ilości rat poza akceptowalny przedział, ilośc rat powinna być ustawiona na 36.

Obliczona miesięczna rata powinna zawierać również odsetki. Dla uproszczenia obliczeń, przyjmij, że do kwoty pożyczki doliczasz X procent w zależności od ilości rat:

6-12 rat - 2,5%,
13-24 rat - 5,0%,
25-48 rat - 10,0%,
a następnie obliczasz kwotę raty na podstawie ilości rat.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
