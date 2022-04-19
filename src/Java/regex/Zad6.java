package Java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad6 {
    //napisz walidator dla numeru PESEL
    //napisz walidator dla numeru IBAN (2 duze litery i 28 cyfr)
    //zrobcie jeden przyklad ktory przejdzie i jeden ktory nie przejdzie
    public static void main(String[] args) {
        //piszemy wyrazenie regularne(regex) i przypisujemy do zmiennej string
        String peselRegex = "[0-9]{11}";
        //na podstawie regexa tworzymy obiekt klasy Pattern, z którego Java wie jak potraktowac wyrazenie regularne
        Pattern peselPattern = Pattern.compile(peselRegex);
        //string ktory bedziemy walidowac
        String input = "93122112345";
        //wywolujemy metode matcher z klasy Pattern, ktora zwraca nam obiekt klasy Matcher
        Matcher nasz_matcher = peselPattern.matcher(input);

        if(nasz_matcher.matches()){
            System.out.println("pesel jest poprawny");
        }
        else{
            System.out.println("pesel nie jest poprawny");
        }
    }

}
