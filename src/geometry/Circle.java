package geometry;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(
                Math.pow(this.x - x, 2) +
                Math.pow(this.y - y, 2)
        );
        return distance <= radius;
    }

    public boolean contains(Circle circle) {
        double distanceBetweenCenters = Math.sqrt(
                Math.pow(this.x - circle.x, 2) +
                Math.pow(this.y - circle.y, 2)
        );
        return distanceBetweenCenters + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle circle) {
        double distanceBetweenCenters = Math.sqrt(
                Math.pow(this.x - circle.x, 2) +
                Math.pow(this.y - circle.y, 2)
        );
        return distanceBetweenCenters < this.radius + circle.radius;
    }
}
