package Java.rozne;

public class DublowanieSlowa {

    public DublowanieSlowa() {
    }

    public static void main(String[] args) {
        System.out.println();
    }

    public static String doubleWords(String input) {
        String result = "";
        String[] var2 = input.split(" ");
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String word = var2[var4];
            result = result + result + word + " " + word + " ";
        }

        return result;
    }
}
