package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shape = new IShape[3];

        shape[0] = new Rectangle(3.4, 5.3);
        shape[1] = new Circle(5.5);
        shape[2] = new Rectangle(7.4, 4.3);

        for (int i = 0; i < 3; i++) {
            System.out.println("Area of shapes[" + i + "]: " + shape[i].getArea());
            System.out.println("Area of shapes[" + i + "]: " + shape[i].getPerimeter());
        }
    }

}
