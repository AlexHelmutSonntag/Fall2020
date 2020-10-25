// package point2d;
// for task 2 we put both PointMain and Point classes in the same package "point2d" now we are putting PointMain in a different package pointm and we should make them both compile
package pointm;

import point2d.Point;

// it should work that way
class PointMain {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 2;
        p.y = 3;
        p.move(1, 1);
        System.out.println(p.x + " " + p.y);
        p.mirror(0, 0);
        System.out.println(p.x + " " + p.y);

        Point origin = new Point();
        origin.x = origin.y = 0;
        p.mirrorV2(origin);
        System.out.println(p.x + " " + p.y);

    }

}