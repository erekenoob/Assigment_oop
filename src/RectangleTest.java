import geometry.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2, 2, 4, 6);
        System.out.println("Rectangle 2 area: " + r2.getArea());
        System.out.println("Rectangle 2 perimeter: " + r2.getPerimeter());

        System.out.println("Rectangle 2 contains (3,3): " + r2.contains(3, 3));
        System.out.println("Rectangle 2 contains (10,10): " + r2.contains(10, 10));

        Rectangle r3 = new Rectangle(2, 2, 2, 2);
        System.out.println("Rectangle r2 contains r3: " + r2.contains(r3));

        Rectangle r4 = new Rectangle(5, 2, 4, 2);
        System.out.println("Rectangle 2 overlaps r4: " + r2.overlaps(r4));
    }
}
