package tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float tempInCelsius = scanner.nextFloat();
        System.out.println(1.8 * tempInCelsius + 32.0);
    }
}

/*
Napisz program, który na podstawie zmiennej temperatura w stopniach Celsjusza - tempInCelsius (float), obliczał będzie temperaturę w stopniach Farhenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0) i wypisywał ją w konsoli.

Temperaturę pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
