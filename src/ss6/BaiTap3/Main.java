package ss6.BaiTap3;

public class Main {
    public static void main(String[] args) {
        MoveablePoint mp = new MoveablePoint(2.0f, 3.0f, 0.5f, 1.0f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}

