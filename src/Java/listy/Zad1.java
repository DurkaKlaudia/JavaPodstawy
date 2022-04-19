package Java.listy;

import java.util.ArrayList;

public class Zad1 {

    public Zad1() {
    }

    public static void main(String[] args) {
        String[] var10000 = new String[]{"Abc", "Cde"};
        ArrayList list = new ArrayList();
        list.add("Abc");
        list.add("Cde");
        list.add("Efg");
        System.out.println(list);
        String[] array = new String[]{"abc", "cde", "efg"};
        String[] var4 = array;
        int var5 = array.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String value = var4[var6];
            if ("cde".equals(value)) {
                System.out.println("Mamy cde");
            }
        }

        System.out.println("Nie mamy cde");
        System.out.println(list.contains("Cde"));
        System.out.println(list.indexOf("Cde"));
        list.remove("Cde");
        System.out.println(list.toString());
    }
}
