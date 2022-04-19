package Java.obiektowe.przyklad;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Student student1 = new Student("Klaudia", 24);
        Student student2 = new Student("Dawid", 25);
        student1.sayHello();
        student2.sayHello();
    }
}
