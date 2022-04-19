package tasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task20 {

    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania
    }

    public static int[] calculateDifference(String dateA, String dateB) {
        DateTimeFormatter dateTimeFormatterA = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter dateTimeFormatterB = DateTimeFormatter.ofPattern("MM--yyyy-d");
        LocalDate localDateA = LocalDate.parse(dateA, dateTimeFormatterA);
        LocalDate localDateB = LocalDate.parse(dateB, dateTimeFormatterB);

        Period period = Period.between(localDateA, localDateB);

        return new int[]{period.getYears(), period.getMonths(), period.getDays()};
    }
}

/*
Napisz metodę, która przyjmuje 2 daty jako parametry typu String w formatach kolejno yyyy::MM::dd oraz MM--yyyy-dd.

Metoda następnie oblicza różnicę między pierwszą a drugą datą.

Metoda zwraca tablicę liczb (int), gdzie pod indeksem 0 znajduje się różnica lat, pod indeksem 1 znajduje się różnica miesięcy a pod indeksem 2 znajduje się różnica dni.

Przykładowo dla dat "2014::01::23" oraz "03--2020-30" zwraca tablicę [6, 2, 7].
 */
