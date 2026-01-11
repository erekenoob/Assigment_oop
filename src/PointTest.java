import geometry.Point;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("p1: (" + p1.getx() + ", " + p1.gety() + ")");

        Point p2 = new Point(3, 4);
        System.out.println("p2: (" + p2.getx() + ", " + p2.gety() + ")");

        double d1 = p1.distance(p2);
        System.out.println("Distance p1 -> p2 = " + d1);

        double d2 = p2.distance(6, 8);
        System.out.println("Distance p2 -> (6,8) = " + d2);
    }
}
