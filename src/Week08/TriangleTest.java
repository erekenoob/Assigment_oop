package Week08;



public class TriangleTest {
    public static void main(String[] args) {

        try {
            Triangle t1 = new Triangle(3, 4, 5);
            System.out.println("Triangle created");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        try {
            Triangle t2 = new Triangle(1, 2, 3);
            System.out.println("Triangle created");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
