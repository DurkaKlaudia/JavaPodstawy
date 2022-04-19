package Java.petle;

import java.util.Random;

public class Przyklad {
    public static void main(String[] args) {
        Random r = new Random();
        int i = -1;
        while( i % 5 != 0 ){
            i = r.nextInt(100);
            System.out.println("wartosc = " + i);
        }
    }

}
