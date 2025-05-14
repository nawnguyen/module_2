package ss5.BaiTap.Bai1;

import java.net.SocketImpl;
import java.sql.SQLOutput;

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI* radius*radius;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2: " + circle2.getRadius());
        System.out.println("Area: "+ circle2.getArea());
    }
}

