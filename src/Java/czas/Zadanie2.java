package Java.czas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

    System.out.println("podaj date w formacie yyyy-MM-dd");
    Scanner input = new Scanner(System.in);
    String inString = input.next();

    LocalDate parsedLocalDate = LocalDate.parse(inString);
    DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(custom.format(parsedLocalDate));
    }
}

