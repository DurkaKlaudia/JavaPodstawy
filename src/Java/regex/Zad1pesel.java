package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1pesel {

    public Zad1pesel() {
    }

    public static void main(String[] args) {
        String peselRegex = "[0-9]{11}";
        Pattern peselPattern = Pattern.compile(peselRegex);
        String input = "96101010110";
        Matcher nasz_matcher = peselPattern.matcher(input);
        if (nasz_matcher.matches()) {
            System.out.println("pesel jest poprawny");
        } else {
            System.out.println("pesel nie jest poprawny");
        }

    }
}
