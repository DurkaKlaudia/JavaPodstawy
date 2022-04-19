package Java.zadania;

import java.util.Scanner;

public class Zadanie10sumaCyfrB {

    private static Scanner scanner;

    public Zadanie10sumaCyfrB() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a value");
        int value = scanner.nextInt();
        System.out.println(countDigitsSum(value));
    }

    private static int countDigitsSum(int value) {
        int result;
        for(result = 0; value != 0; value /= 10) {
            result += value % 10;
        }

        return Math.abs(result);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
