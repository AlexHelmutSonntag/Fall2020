package circle;
import circle.utils.Point2;

public class MainCircle {
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.center = new circle.utils.Point2();
        // We either import.circle.utils.Point2 or we use circle.utils.Point2 everytime we refer to it. I just put it here as an example, no more.
        c1.center.x = 3;
        c1.center.y = 5;
        c1.radius = 10;
        System.out.println(c1);
        c1.enlarge(3);
        System.out.println(c1);    
    }
    
}