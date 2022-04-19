package Java.figury.figury2;

import java.util.Scanner;

public class Prostokat {

    public Prostokat() {
    }

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;

    public void zczytaj(){
        System.out.println("podaj boki");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
