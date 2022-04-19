package Java.zadania;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie14apsik {

    public static void main(String[] args) {
        String kichanieRegex = "a+ psik";
        Pattern kichaniePsttern = Pattern.compile(kichanieRegex);
        String input = "a psik";
        Matcher nasz_matcher = kichaniePsttern.matcher(input);
        if (nasz_matcher.matches()) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

    }
}
