package Java.petle;

public class Zadanie15 {

    public static void main(String[] args) {

        int[] tab = new int[10];

        int i = 0;
        tab[0] = 10;

        while (i < tab.length - 1){
            tab[i + 1] = tab[i] + 10;
            System.out.println(tab[i]);
            i++;
        }
        System.out.println(tab[tab.length - 1]);
    }
}
