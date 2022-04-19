package tasks;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();
        int n = scanner.nextInt();
        char[] text2 = new char[text.length];

        for (int i = 0; i < text.length; i++){
            if (text[i] == ' '){
                text2[i] = text[i];
                continue;
            }
            int charCode = ((int) text[i] + n) - 96;
            charCode = charCode % 26 + 96;

            text2[i] = (char) charCode;
        }

        System.out.println(new String(text2));
    }
}

/*
Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego monoalfabetycznego. Program pobiera od użytkownika tekst do zaszyfrowania oraz liczbę n, o którą przesunięty jest alfabet za pomocą którego szyfrowany jest tekst, a następnie wypisuje zaszyfrowany tekst w konsoli. Dla uproszczenia można przyjąć, że łańcuch wejściowy składa się tylko z małych liter alfabetu angielskiego, tj. 'a' - 'z' oraz spacji.

Przykład a: tekst: "ala ma kota", n: 1, wynik: "bmb nb lpub"

Przykład b: tekst: "ala ma kota", n: 26, wynik: "ala ma kota"

Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.
 */
