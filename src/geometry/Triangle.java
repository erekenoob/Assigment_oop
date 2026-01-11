package geometry;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this(
            new Point(0, 0),
            new Point(1, 1),
            new Point(2, 5)
        );
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }

    public void setP1(Point p1) { this.p1 = p1; }
    public void setP2(Point p2) { this.p2 = p2; }
    public void setP3(Point p3) { this.p3 = p3; }

    public double getArea() {
        return Math.abs(cross(p1, p2, p3)) / 2.0;
    }

    public double getPerimeter() {
        return p1.distance(p2) +
               p2.distance(p3) +
               p3.distance(p1);
    }

    public boolean contains(Point p) {
        double a = Math.abs(cross(p, p1, p2));
        double b = Math.abs(cross(p, p2, p3));
        double c = Math.abs(cross(p, p3, p1));
        double area2 = Math.abs(cross(p1, p2, p3));

        return Math.abs((a + b + c) - area2) < 1e-9;
    }

    public boolean contains(Triangle t) {
        return contains(t.p1) &&
               contains(t.p2) &&
               contains(t.p3);
    }

    public boolean overlaps(Triangle triangle) {
        if (contains(triangle.p1) || contains(triangle.p2) || contains(triangle.p3)) {
            return true;
        }

        if (triangle.contains(p1) || triangle.contains(p2) || triangle.contains(p3)) {
            return true;
        }

        return false;
    }

    private static double cross(Point a, Point b, Point c) {
        double abx = b.getx() - a.getx();
        double aby = b.gety() - a.gety();
        double acx = c.getx() - a.getx();
        double acy = c.gety() - a.gety();
        return abx * acy - aby * acx;
    }
}
