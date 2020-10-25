public class Mass2 {
    public static void main(String[]args)
    {
        System.out.print("Enter num of elements > ");
        int num = Integer.parseInt(System.console().readLine());
        Point2[]arr = new Point2[num];
        for(int i =0;i<num;++i)
        {
            System.out.print("Enter x : ");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y : ");
            double y = Double.parseDouble(System.console().readLine());
            arr[i] = new Point2(x,y);
        }
        Point2 center = Point2.centerOfMass(arr);
        System.out.println("Center of Mass: "+ center);
    }
    
    
}