package tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        if (income < 85528.00){
            double result = income * 0.18 - 556.02;
            if (result < 0){
                System.out.println("0");
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println(14839.02 + ((income - 85528.00) * 0.32));
        }
    }
}

/*
Napisz program, który na podstawie zmiennej: przychód - income (double), obliczał będzie kwotę należnego podatku dochodowego od osób fizycznych i wypisywał ją w konsoli.

Podatek obliczany jest według następujących reguł:

do 85.528,00 podatek wynosi 18% podstawy minus 556,02 PLN,
od 85.528,00 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00.
Przychód pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */