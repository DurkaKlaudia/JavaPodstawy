package Java.figury.notatka;

public class Kalkulator {

    public static double policzObwod(Kolo kolo){
        return 2 * 3.14 * kolo.getRad();
    }

    public static double policzObwod(Prostokat prostokat){
        return 2 * (prostokat.getA() + prostokat.getB());
    }

    public static double policzPole(Kolo kolo){
        return 3.14 * kolo.getRad() * kolo.getRad();
    }

    public static double policzPole(Prostokat prostokat){
        return prostokat.getB() * prostokat.getA();
    }

    public static double sumuj(double... a){
        double sum = 0;
        for(double i : a){
            sum += i;
        }
        return sum;
    }
}
