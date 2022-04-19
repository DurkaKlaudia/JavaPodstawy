package Java.obiektowe.zad2pokoj;

public class Pokoj {

    private double wysokosc;
    private double szerokosc;
    private double dlugosc;

    public Pokoj(double wysokosc, double szerokosc, double dlugosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    public Pokoj(double szerokosc, double dlugosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.wysokosc = 2.4D;
    }

    public double obliczPole() {
        return this.szerokosc * this.dlugosc;
    }

    public double obliczObjetosc() {
        return this.szerokosc * this.wysokosc * this.dlugosc;
    }

    public void wyswietlPole() {
        System.out.println(this.obliczPole());
    }

    public void wyswietlObjetosc() {
        System.out.println(this.obliczObjetosc());
    }

    public void drukujParametry() {
        System.out.println(this.wysokosc);
        System.out.println(this.szerokosc);
        System.out.println(this.dlugosc);
    }
}
