package Java.zadania;

import java.util.Scanner;

public class Zadanie2bmi {

    public Zadanie2bmi() {
    }

    public static void main(String[] args) {
        System.out.println("Enter your height:");
        Scanner m = new Scanner(System.in);
        double height = m.nextDouble();
        System.out.println("Enter your weight:");
        Scanner kg = new Scanner(System.in);
        double weight = kg.nextDouble();
        estimateBMI(weight, height);
    }

    private static void estimateBMI(double weight, double height) {
        double heightInM = height / 100.0D;
        double bmi = weight / Math.pow(heightInM, 2.0D);
        System.out.println(bmi);
        if (!(bmi >= 24.9D) && !(bmi <= 18.5D)) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }

    }
}
