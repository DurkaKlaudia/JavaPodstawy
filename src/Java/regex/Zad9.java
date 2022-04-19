package Java.regex;

import java.util.regex.Pattern;

public class Zad9 {

    public static void main(String[] args) {
        //walidator dla numeru NIP
        //Prefiks kraju - albo na stale PL, albo jakies dowolne dwie duze litery
        //kod urzedu staly - 123
        //ciag 6 cyfr - dowolne cyfry
        //ostatnia cyfra kontrolna - z zakresu od 4 do 7
        //myslniki pomiedzy kazdym z czlonów

    }

    public static void validate(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        if(pattern.matcher(input).matches()){
            System.out.println("pasuje");
        }
        else {
            System.out.println("nie pasuje");
        }
    }
}
