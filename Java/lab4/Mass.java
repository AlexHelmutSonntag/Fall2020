import java.util.Scanner;

public class Mass {
    public static void main(String[] args) {
        Point[] arr = new Point[3];
        for (int i = 0; i < 3; ++i) {
            System.out.print("Enter x = " );
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y = " );
            double y = Double.parseDouble(System.console().readLine());
        }
        double center_x = 0;
        double center_y = 0;
        for (int i = 0; i < 3; ++i) {
            center_x += arr[i].getX();
            center_y += arr[i].getY();
        }
        center_x = center_x / 3;
        center_y = center_y / 3;
        Point center = new Point(center_x, center_y);
        System.out.println("Center of mass = " + center);

    }
}