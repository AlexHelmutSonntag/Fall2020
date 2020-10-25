public class CircleMain {
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.x=2;
        c1.y = 3;
        c1.radius =5;
        System.out.println("The Area of circle before is  = "+ c1.getArea());
        c1.enlarge(2);
        c1.getArea();
        System.out.println("The Area of circle After is  = "+ c1.getArea());
        
    }   
    
}