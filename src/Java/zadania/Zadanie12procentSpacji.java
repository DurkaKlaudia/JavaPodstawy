package Java.zadania;

import java.util.Scanner;

public class Zadanie12procentSpacji {

    private static Scanner scanner;

    public Zadanie12procentSpacji() {
    }

    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        System.out.println(getPercentSpaces(sentence));
    }

    private static float getPercentSpaces(String sentence) {
        char[] words = sentence.toCharArray();
        int amountOfSpaces = 0;
        char[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            char letter = var3[var5];
            if (letter == ' ') {
                ++amountOfSpaces;
            }
        }

        return (float)amountOfSpaces / (float)sentence.length() * 100.0F;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
