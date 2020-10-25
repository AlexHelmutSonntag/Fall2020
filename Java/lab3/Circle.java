package circle;
import circle.utils.Point2;

public class Circle {
    public Point2 center; 
    public double radius;
    //making them private for Task 5
    // private Point2 center;
    // private double radius;
    // Make a parameterized constructor for the class Circle
    // public Circle(Point2 center_input, double radius_input){
    //     this.radius = radius_input;
    //     this.center = center_input;
    // }
    // public Circle(double x_input, double y_input, double radius_input)
    // {   
    //     this.center.x = x_input;
    //     this.center.y = y_input;
    //     this.radius = radius_input;
    // }
    public void enlarge(double f)
    {
        this.radius *=f;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        return "(" + center.x + ","+ center.y+ ")"+ ", r = "+ this.radius;
    }
}