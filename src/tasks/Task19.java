package tasks;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task19 {

    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania
    }

    public static LocalDate toLocalDate(String pattern, String input) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(input, dateTimeFormatter);
    }
}

/*
Napisz metodę, która przyjmuje format daty oraz datę jako parametry typu String i zwraca obiekt klasy LocalDate.
 */