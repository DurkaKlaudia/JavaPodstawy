package tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.replaceAll("[^a-zA-Z ]", "")
                .toLowerCase().split("\\s+");
        Map<String, Integer> wordsOccurrences = new TreeMap<>();

        for (String word : words) {
            Integer count = wordsOccurrences.get(word);
            if (count != null) {
                count++;
            } else {
                count = 1;
            }

            wordsOccurrences.put(word, count);
        }

        wordsOccurrences.forEach((key, val)
                -> System.out.println(key + " - " + val));
    }
}

/*
Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a nastepnie dzieli go na poszczególne słowa. Następnie zlicza ilość wystąpień słów niezależnie od wielkości liter i wypisuje je w konsoli w kolejności alfabetycznej.

Przykładowo dla tekstu "Ala lubi koty, ale nie jest przez Koty lubiana.", program powinien wypisać w konsoli:

ala - 1
ale - 1
jest - 1
koty - 2
lubi - 1
lubiana - 1
nie - 1
przez - 1
Załóż, że w tekscie moga pojawić się dowolne znaki interpunkcyjne.

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
