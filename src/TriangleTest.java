import geometry.Point;
import geometry.Triangle;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        System.out.println("Area t1: " + t1.getArea());
        System.out.println("Perimeter t1: " + t1.getPerimeter());

        Triangle t2 = new Triangle(
                new Point(0, 0),
                new Point(5, 0),
                new Point(0, 5)
        );

        System.out.println("Area t2: " + t2.getArea());
        System.out.println("Perimeter t2: " + t2.getPerimeter());

        Point p = new Point(1, 1);
        System.out.println("\nt2 contains (1,1): " + t2.contains(p));

        Triangle t3 = new Triangle(
                new Point(1, 1),
                new Point(2, 1),
                new Point(1, 2)
        );
        System.out.println("t2 contains t3: " + t2.contains(t3));

        Triangle t4 = new Triangle(
                new Point(4, 4),
                new Point(6, 4),
                new Point(4, 6)
        );
        System.out.println("t2 overlaps t4: " + t2.overlaps(t4));
    }
}
