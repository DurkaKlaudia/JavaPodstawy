package Java.obiektowe.przyklad;

public class Student {

    private String name;
    private int age;

    public Student(String input_name, int input_age) {
        this.name = input_name;
        this.age = input_age;
    }

    public void sayHello() {
        System.out.println("My name is " + this.name + ", I am " + this.age + " years old");
    }
}
