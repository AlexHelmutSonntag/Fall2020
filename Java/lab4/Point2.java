public class Point2 {
    private double x, y;

    public Point2(double x_input, double y_input) {
        this.x = x_input;
        this.y = y_input;
    }

    public Point2(Point2 that) {
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

    void mirrorV2(Point2 c) {
        x = 2 * c.x - x;
        y = 2 * c.y - y;
    }

    double distance(Point2 that) {
        double dx = x - that.x;
        double dy = x - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    static double getDistance(Point2 A, Point2 B) {
        double dx = A.x - B.x;
        double dy = A.y - B.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public static Point2 centerOfMass(Point2[] arr) {
        double center_x = 0;
        double center_y = 0;
        for (int i = 0; i < arr.length; ++i) {
            center_x += arr[i].getX();
            center_y += arr[i].getY();
        }
        center_x/= arr.length;
        center_y/= arr.length;
        return new Point2(center_x,center_y);
    }
}