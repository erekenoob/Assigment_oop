public class Point {

    private double x;
    private double y;

    public Point(){
        this(0,0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(
                Math.pow(this.x - p.x, 2) +
                        Math.pow(this.y - p.y, 2)
        );
    }

    public double distance(double x, double y) {
        return Math.sqrt(
                Math.pow(this.x - x, 2) +
                        Math.pow(this.y - y, 2)
        );
    }
}