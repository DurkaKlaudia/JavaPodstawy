package Java.figury.notatka;

public class Main {

    public static void main(String[] args) {


        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(2, 3);

        Kalkulator.policzObwod(kolo);

        Kalkulator.policzObwod(prostokat);

        Kalkulator.policzPole(kolo);

        Kalkulator.policzPole(prostokat);

        System.out.println(Kalkulator.sumuj(1, 2, 3, 4, 5, 6));
    }
}
