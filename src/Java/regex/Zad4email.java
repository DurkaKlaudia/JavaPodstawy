package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad4email {

    public Zad4email() {
    }

    public static void main(String[] args) {
        String emailRegex = "[a-z0-9.-_]+@[a-z0-9.-_]+.[a-z]{2,10}+";
        Pattern emailPattern = Pattern.compile(emailRegex);
        String input = "klaaudia12356@wp.pl";
        Matcher nasz_matcher = emailPattern.matcher(input);
        if (nasz_matcher.matches()) {
            System.out.println("email jest poprawny");
        } else {
            System.out.println("email nie jest poprawny");
        }

    }
}
