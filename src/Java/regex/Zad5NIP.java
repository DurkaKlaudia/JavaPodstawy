package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad5NIP {

    public Zad5NIP() {
    }

    public static void main(String[] args) {
        String nipRegex = "PL-123-[0-9]{6}-[4-7]{1}";
        Pattern nipPattern = Pattern.compile(nipRegex);
        String input = "PL-123-123456-5";
        Matcher nasz_matcher = nipPattern.matcher(input);
        if (nasz_matcher.matches()) {
            System.out.println("NIP jest poprawny");
        } else {
            System.out.println("NIP nie jest poprawny");
        }

    }
}
