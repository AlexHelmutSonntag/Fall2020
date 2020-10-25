public class Circle {
    double x ,y;
    double radius;
    
    void enlarge(double factor)
    {
        radius*=factor;
    }
    String getArea()
    {
        return String.format("%.3f",Math.PI*radius*radius);
    }
    
}