import geometry.Circle;

public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1 center: (" + c1.getX() + ", " + c1.getY() + ")");
        System.out.println("c1 radius: " + c1.getRadius());

        Circle c2 = new Circle(2, 2, 3);
        System.out.println("\nc2 center: (" + c2.getX() + ", " + c2.getY() + ")");
        System.out.println("c2 radius: " + c2.getRadius());

        System.out.println("\nc2 area: " + c2.getArea());
        System.out.println("c2 perimeter: " + c2.getPerimeter());

        System.out.println("\nc2 contains point (3,3): " + c2.contains(3, 3));
        System.out.println("c2 contains point (10,10): " + c2.contains(10, 10));

        Circle c3 = new Circle(2, 2, 1);
        System.out.println("\nc2 contains c3: " + c2.contains(c3));

        Circle c4 = new Circle(5, 2, 2);
        System.out.println("c2 overlaps c4: " + c2.overlaps(c4));
    }
}
