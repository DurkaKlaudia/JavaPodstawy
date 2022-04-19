package Java.ifWarunkowe;

import java.util.Scanner;

public class Zad7 {

    public Zad7() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj nazwę dnia tygodnia ");
        Scanner sc = new Scanner(System.in);
        String dzien = sc.next();
        byte var4 = -1;
        switch(dzien.hashCode()) {
            case -1899775346:
                if (dzien.equals("Piątek")) {
                    var4 = 4;
                }
                break;
            case -1813207050:
                if (dzien.equals("Sobota")) {
                    var4 = 5;
                }
                break;
            case -1693683130:
                if (dzien.equals("Wtorek")) {
                    var4 = 1;
                }
                break;
            case 323044308:
                if (dzien.equals("Środa")) {
                    var4 = 2;
                }
                break;
            case 910436233:
                if (dzien.equals("Czwartek")) {
                    var4 = 3;
                }
                break;
            case 976939151:
                if (dzien.equals("Poniedziałek")) {
                    var4 = 0;
                }
                break;
            case 1486335889:
                if (dzien.equals("Niedziela")) {
                    var4 = 6;
                }
        }

        switch(var4) {
            case 0:
                System.out.println("1");
                break;
            case 1:
                System.out.println("2");
                break;
            case 2:
                System.out.println("3");
                break;
            case 3:
                System.out.println("4");
                break;
            case 4:
                System.out.println("5");
                break;
            case 5:
                System.out.println("6");
                break;
            case 6:
                System.out.println("7");
                break;
            default:
                System.out.println("nie istnie dzień tygodnia o podanej nazwie");
        }

    }
}
