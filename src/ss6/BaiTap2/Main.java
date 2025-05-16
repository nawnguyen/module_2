package ss6.BaiTap2;

public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 4.5f);
        System.out.println("Point2D: " + p2d);
        p2d.setXY(1.1f, 2.2f);
        System.out.println("Updated Point2D: " + p2d);

        Point3D p3d = new Point3D(5.5f, 6.6f, 7.7f);
        System.out.println("Point3D: " + p3d);
        p3d.setXYZ(8.8f, 9.9f, 10.1f);
        System.out.println("Updated Point3D: " + p3d);
    }
}
