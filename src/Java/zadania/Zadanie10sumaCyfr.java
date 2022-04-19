package Java.zadania;

import java.util.Scanner;

public class Zadanie10sumaCyfr {

    public Zadanie10sumaCyfr() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String inscription = String.valueOf(a);
        int suma = 0;

        for(int i = 0; i < inscription.length(); ++i) {
            suma += Character.getNumericValue(inscription.charAt(i));
        }

        System.out.println("The sum of all digits is: " + suma);
    }
}
