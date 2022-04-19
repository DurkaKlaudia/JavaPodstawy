package Java.rozne;

import java.util.Scanner;

public class Fala {

    public Fala() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < a; ++j) {
                switch(i) {
                    case 0:
                        System.out.print("*      *");
                        if (j == a - 1) {
                            System.out.println();
                        }
                        break;
                    case 1:
                        System.out.print(" *    * ");
                        if (j == a - 1) {
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.print("  *  *  ");
                        if (j == a - 1) {
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.print("   **   ");
                        if (j == a - 1) {
                            System.out.println();
                        }
                }
            }
        }

    }
}
