package Java.zadania;

import java.util.Scanner;

public class Zadanie13jakajacyProgram {

    private static Scanner scanner;

    public Zadanie13jakajacyProgram() {
    }

    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        System.out.println(getStummerSentence(sentence));
    }

    private static String getStummerSentence(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        String[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String word = var3[var5];
            result = result + word + " " + word + " ";
        }

        return result;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
