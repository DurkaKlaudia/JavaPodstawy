package Java.obiektowe.zad3kalkulator;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        Kalkulator.znak = input.next();
        double b = input.nextDouble();
        String var6 = Kalkulator.znak;
        byte var7 = -1;
        switch(var6.hashCode()) {
            case 37:
                if (var6.equals("%")) {
                    var7 = 4;
                }
            case 38:
            case 39:
            case 40:
            case 41:
            case 44:
            case 46:
            default:
                break;
            case 42:
                if (var6.equals("*")) {
                    var7 = 2;
                }
                break;
            case 43:
                if (var6.equals("+")) {
                    var7 = 0;
                }
                break;
            case 45:
                if (var6.equals("-")) {
                    var7 = 1;
                }
                break;
            case 47:
                if (var6.equals("/")) {
                    var7 = 3;
                }
        }

        switch(var7) {
            case 0:
                System.out.println(Kalkulator.dodawanie(a, b));
                break;
            case 1:
                System.out.println(Kalkulator.odejmowanie(a, b));
                break;
            case 2:
                System.out.println(Kalkulator.mnozenie(a, b));
                break;
            case 3:
                System.out.println(Kalkulator.dzielenie(a, b));
                break;
            case 4:
                System.out.println(Kalkulator.modulo(a, b));
                break;
            default:
                System.out.println("Nie ma takiego działania");
        }
    }
}
