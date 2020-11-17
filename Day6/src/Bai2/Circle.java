package Bai2;

public class Circle implements IShape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }
}
