package Java.zadania;

import java.util.Scanner;

public class Zadanie11najdluzszyWyraz {

    private static Scanner scanner;

    public Zadanie11najdluzszyWyraz() {
    }

    public static void main(String[] args) {
        System.out.println(findLongest());
    }

    private static String findLongest() {
        String word = scanner.next();

        String longestWord;
        for(longestWord = ""; !"starczy".equalsIgnoreCase(word); word = scanner.next()) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        if ("".equals(longestWord)) {
            return "Nie podano żadnego słowa";
        } else {
            return longestWord;
        }
    }

    static {
        scanner = new Scanner(System.in);
    }
}
