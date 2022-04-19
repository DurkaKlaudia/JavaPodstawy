package Java.figury.figury2;

public class Kalkulator {

    public static double obliczObwod(Kolo kolo){
        double wynik;
        wynik = 2 * Math.PI * kolo.getR();
        return wynik;
        //return 2 * Math.PI * kolo.getR();
    }
    public static double obliczPole(Kolo arg_kolo){
        return Math.PI * arg_kolo.getR() * arg_kolo.getR();
    }

    public static double obliczObwod(Prostokat prostokat){
        return prostokat.getA() * 2 + prostokat.getB() * 2;
    }

    public static double obliczPole(Prostokat prostokat){
        return prostokat.getA() * prostokat.getB();
    }
}
