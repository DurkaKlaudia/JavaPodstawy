package Java.zadania;

public class Zadanie7fibonacci {

    public Zadanie7fibonacci() {
    }

    public static void main(String[] args) {
        System.out.println(getFibpnacciNumber(12));
    }

    private static int getFibpnacciNumber(int index) {
        int value1 = 1;
        int value2 = 1;

        for(int i = 3; i <= index; ++i) {
            int currentValue = value1 + value2;
            value1 = value2;
            value2 = currentValue;
        }

        return value2;
    }
}
