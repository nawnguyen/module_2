package ss7.BaiTap.shape;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        side += side * percent / 100;
        super.resize(percent); // cập nhật width & height của Rectangle
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Hình vuông (cạnh: " + side + ")";
    }
}
