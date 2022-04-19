package Java.obiektowe.zad1pies;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Pies pies1 = new Pies("Owczarek", "M");
        Pies pies2 = new Pies("Lablador", "F");
        pies1.setWiek(5);
        Pies[] tablica_psow = new Pies[]{pies1, pies2};
        Pies[] var4 = tablica_psow;
        int var5 = tablica_psow.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Pies pies = var4[var6];
            pies.wydrukujParametry();
            System.out.println();
        }

    }
}
