package Java.zadania;

import java.util.Scanner;

public class Zadanie13jakajacyProgramC {

    private static Scanner scanner;

    public Zadanie13jakajacyProgramC() {
    }

    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        System.out.println(getStummerSentence(sentence));
    }

    private static String getStummerSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String word = var3[var5];
            stringBuilder.append(word.concat(" ").repeat(2));
        }

        return stringBuilder.toString();
    }

    static {
        scanner = new Scanner(System.in);
    }
}
