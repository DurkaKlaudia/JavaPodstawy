package Java.figury;

public class Kalkulator {

    public Kalkulator() {
    }

    public static double obliczObwod(Kolo koło) {
        return 6.283185307179586D * koło.getR();
    }

    public static double obliczPole(Kolo koło) {
        return 3.141592653589793D * koło.getR() * koło.getR();
    }

    public static double obliczObwod(Prostokat prostokąt) {
        return prostokąt.getA() * 2.0D + prostokąt.getB() * 2.0D;
    }

    public static double obliczPole(Prostokat prostokąt) {
        return prostokąt.getA() * prostokąt.getB();
    }

    public static double obliczPole(Trojkat trójkąt) {
        double p = (trójkąt.getA() + trójkąt.getB() + trójkąt.getC()) / 2.0D;
        return Math.sqrt(p * (p - trójkąt.getA()) * (p - trójkąt.getB()) * (p - trójkąt.getC()));
    }

    public static double obliczObwod(Trojkat trójkąt) {
        return trójkąt.getA() + trójkąt.getB() + trójkąt.getC();
    }
}
