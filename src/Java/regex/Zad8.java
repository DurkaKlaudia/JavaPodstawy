package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad8 {

    public static void main(String[] args) {
        String text = "John Doe, age:27 id:123123456, phone:555-1231-23";
        Pattern pattern = Pattern.compile("([a-zA-Z]*)\\s([a-zA-Z]*).*age:([0-9]*).*id:([0-9]*)" +
                ".*phone:([0-9].*-?[0-9].*-?[0-9].*-?[0-9].*-?[0-9].*)");

        Matcher matcher = pattern.matcher(text);
        System.out.println("Found anything? " + matcher.find());
        System.out.println("Name: " + matcher.group(1));
        System.out.println("Surname: " + matcher.group(2));
        System.out.println("Age: " + matcher.group(3));
        System.out.println("ID: " + matcher.group(4));
        System.out.println("Phone no: " + matcher.group(5));
    }
}
