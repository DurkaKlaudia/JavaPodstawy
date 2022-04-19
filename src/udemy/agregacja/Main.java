package udemy.agregacja;

public class Main {

    public static void main(String[] args) {

        Pracownik p = new Pracownik("Jan", new Adres("Kadlubka", 32));

        System.out.println(p);
    }

    static class Pracownik{

        String imie;
        Adres adres;

        public Pracownik(String imie, Adres adres){

            this.imie = imie;
            this.adres = adres;
        }

        @Override
        public String toString(){

            return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
        }
    }

    static class Adres{

        String ulica;
        int nrDomu;

        public Adres(String ulica, int nrDomu){

            this.ulica = ulica;
            this.nrDomu = nrDomu;
        }
    }
}
