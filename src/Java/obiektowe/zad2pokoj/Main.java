package Java.obiektowe.zad2pokoj;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Pokoj pokoj1 = new Pokoj(5.0D, 10.0D);
        Pokoj pokoj2 = new Pokoj(20.0D, 35.0D);
        pokoj1.wyswietlPole();
        pokoj2.wyswietlPole();
        System.out.println();
        pokoj1.wyswietlObjetosc();
        pokoj2.wyswietlObjetosc();
    }
}
