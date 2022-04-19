package Java.wall;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0.0D) {
            this.width = 0.0D;
        } else {
            this.width = width;
        }

    }

    public void setHeight(double height) {
        if (height < 0.0D) {
            this.height = 0.0D;
        } else {
            this.height = height;
        }

    }

    public double getArea() {
        return this.width * this.height;
    }
}
