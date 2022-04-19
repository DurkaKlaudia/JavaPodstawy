package Java.rozne;

import java.util.Scanner;

public class Romb {

    public Romb() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wysRombu = sc.nextInt();
        int polRombu;
        if (wysRombu % 2 == 0) {
            polRombu = wysRombu / 2 - 1;
        } else {
            polRombu = wysRombu / 2;
        }

        int count = 1;

        int i;
        int j;
        for(i = 0; i < polRombu; ++i) {
            for(j = 0; j <= polRombu * 2; ++j) {
                if (j >= polRombu - i && j <= polRombu + i) {
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }
            }

            ++count;
            System.out.println();
        }

        for(i = polRombu; i >= 0; --i) {
            for(j = 0; j <= polRombu * 2; ++j) {
                if (j >= polRombu - i && j <= polRombu + i) {
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }
            }

            ++count;
            System.out.println();
        }

    }
}
