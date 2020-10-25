package circle.utils;
public class Point {
    private double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x , double y)
    {
        this.x = x;
        this.y = y;

    }
    public Point(Point that) {
        this.x = that.x;
        this.y = that.y;
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    void mirror(double cx, double cy) {
        x = 2 * cx - x;
        y = 2 * cy - y;
    }

    void mirrorV2(Point c) {
        x = 2 * c.x - x;
        y = 2 * c.y - y;
    }

    double distance(Point that) {
        double dx = x - that.x;
        double dy = x - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    static double getDistance(Point A, Point B) {
        double dx = A.x - B.x;
        double dy = A.y - B.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }
}