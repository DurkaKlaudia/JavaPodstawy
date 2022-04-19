package Java.dummy;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(Dummy.isGreaterThan5(10));
        Dummy dummy = new Dummy();
        System.out.println(dummy.isGreaterThan10(11));
    }
}
