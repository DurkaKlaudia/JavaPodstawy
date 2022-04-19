package Java.tablice;

public class Zad8powtarzajaceElementy {

    public Zad8powtarzajaceElementy() {
    }

    public static void main(String[] args) {
        String[] tab = new String[]{"aaa", "bbb", "ccc", "bbb", "ddd", "aaa"};

        for(int i = 0; i < tab.length; ++i) {
            String napis = tab[i];

            for(int j = 0; j < i || j > i; ++j) {
                if (tab[j].equals(napis)) {
                    System.out.println(tab[j]);
                }
            }
        }
    }
}
