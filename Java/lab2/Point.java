public class Point {
    double x, y;
    void move(double dx, double dy)
    {
        x+=dx;
        y+=dy;
    }
    void mirror(double cx, double cy)
    {
        x = 2*cx-x;
        y = 2*cy-y;
    }
    void mirrorV2(Point c)
    {
        x = 2*c.x-x;
        y = 2*c.y-y;
    }

    double distance(Point that)
    {
        double dx = x - that.x;
        double dy = x - that.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    static double getDistance(Point A, Point B)
    {
        double dx = A.x - B.x;
        double dy = A.y - B.y;
        return Math.sqrt(dx*dx + dy*dy);

    }
}