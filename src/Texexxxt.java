class Car {
    String color;
    int speed;

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void drive() {
        System.out.println("Xe " + color + " dang chay voi toc do " + speed + " km/h");
    }
}

public class Texexxxt {
    public static void main(String[] args) {
        Car car1 = new Car("do", 132);
        Car car2 = new Car("xanh", 233);

        car1.drive();
        car2.drive();
    }
}