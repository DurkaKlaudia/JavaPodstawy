package Java.wall;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5.0D, 4.0D);
        System.out.println("area " + wall.getArea());
        wall.setHeight(-1.5D);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
