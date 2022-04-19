package Java.tablice;

public class Zad2 {

    public Zad2() {
    }

    public static void main(String[] args) {
        String[] tab = new String[]{"Adam", "Arkadiusz", "Kuba", "Ida", "Mia"};
        String suma = "";
        String[] var3 = tab;
        int var4 = tab.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String element = var3[var5];
            suma = suma + element + " ";
        }

        System.out.println(suma);
    }
}
