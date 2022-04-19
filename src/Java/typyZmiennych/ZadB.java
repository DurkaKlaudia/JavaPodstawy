package Java.typyZmiennych;

import java.util.Scanner;

public class ZadB {

    public ZadB() {
    }

    public static void main(String[] args) {
        System.out.println("Proszę podać liczbę");
        Scanner Celciusz = new Scanner(System.in);
        double C = Celciusz.nextDouble();
        System.out.println("Podana temperatura w stopniach Celciusza w przeliczeniu na Fahrenheity wynosi:");
        double F = 32.0D + 1.8D * C;
        System.out.println(F);
    }


}
