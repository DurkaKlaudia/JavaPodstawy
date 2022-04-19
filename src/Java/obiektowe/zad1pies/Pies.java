package Java.obiektowe.zad1pies;

public class Pies {

    private String rasa;
    private int wiek = 0;
    private String płeć;

    public Pies(String rasa, String płeć) {
        this.rasa = rasa;
        this.płeć = płeć;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return this.wiek;
    }

    public void szczekansko() {
        System.out.println("Woof!");
    }

    public void wydrukujParametry() {
        System.out.println(this.rasa);
        System.out.println(this.wiek);
        System.out.println(this.płeć);
    }
}
