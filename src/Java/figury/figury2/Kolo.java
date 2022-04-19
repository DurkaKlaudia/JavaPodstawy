package Java.figury.figury2;

import java.util.Scanner;

public class Kolo {

    public Kolo() {
    }

    public Kolo(double r) {
        this.r = r;
    }

    private double r;

    public void zczytaj(){
        System.out.println("podaj promien");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
