package Java.zadania;

import java.util.Scanner;

public class Zadanie12procentSpacjiB {

    private static Scanner scanner;

    public Zadanie12procentSpacjiB() {
    }

    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        System.out.println(getPercentSpaces(sentence));
    }

    private static float getPercentSpaces(String sentence) {
        String sentenceWithoutSpaces = sentence.replaceAll(" ", "");
        return (float)(sentence.length() - sentenceWithoutSpaces.length()) / (float)sentence.length() * 100.0F;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
