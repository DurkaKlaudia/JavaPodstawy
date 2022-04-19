package Java.zadania;

import java.util.Scanner;

public class Zadanie9fala {

    private static final Scanner scanner;

    public Zadanie9fala() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a wave's length:");
        int wavesLength = scanner.nextInt();
        drawWave(wavesLength);
    }

    private static void drawWave(int length) {
        String[] elements = new String[]{"*      *", " *    * ", "  * *   ", "   **   "};
        String[] var2 = elements;
        int var3 = elements.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String element = var2[var4];
            System.out.println(element.repeat(length));
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
