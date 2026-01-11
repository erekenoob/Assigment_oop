package geometry;

public class Rectangle {

    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double px, double py) {
        return px >= left() && px <= right()
            && py >= bottom() && py <= top();
    }

    public boolean contains(Rectangle r) {
        return r.left() >= this.left()
            && r.right() <= this.right()
            && r.bottom() >= this.bottom()
            && r.top() <= this.top();
    }

    public boolean overlaps(Rectangle r) {
        return !(r.left() > this.right()
              || r.right() < this.left()
              || r.top() < this.bottom()
              || r.bottom() > this.top());
    }

    private double left() {
        return x - width / 2;
    }

    private double right() {
        return x + width / 2;
    }

    private double bottom() {
        return y - height / 2;
    }

    private double top() {
        return y + height / 2;
    }
}
