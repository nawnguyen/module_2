package ss7.BaiTap.controller;

import ss7.BaiTap.shape.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println("Trước khi thay đổi kích thước:");
            System.out.println(shape);
            System.out.println("Diện tích: " + shape.getArea());

            double percent = Math.random() * 100 + 1;

            System.out.println("Sau khi tăng kích thước lên " + String.format("%.2f", percent) + "%:");
            System.out.println(shape);
            System.out.println("Diện tích: " + shape.getArea());
            System.out.println("------------------------------------");
        }
    }
}
