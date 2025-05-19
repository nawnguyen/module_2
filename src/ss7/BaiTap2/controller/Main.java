package ss7.BaiTap2.controller;

import ss7.BaiTap2.ColorableShapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(3, 6);

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("-------------------------");
        }
    }
}

