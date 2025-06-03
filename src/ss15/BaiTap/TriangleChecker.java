package ss15.BaiTap;

public class TriangleChecker {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại");
        }
    }
}
