package Java.zadania;

import java.util.Scanner;

public class Zadanie8kalkulator {
    public Zadanie8kalkulator() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        Scanner input1 = new Scanner(System.in);
        char symbol = input1.next().charAt(0);
        Scanner input2 = new Scanner(System.in);
        float b = input2.nextFloat();
        calculator(a, b, symbol);
    }

    private static void calculator(float a, float b, char symbol) {
        switch(symbol) {
            case '*':
                System.out.println(a * b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case ',':
            case '.':
            default:
                System.out.println("Error");
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
        }
    }
}
