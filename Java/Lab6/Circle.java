package circle;

import java.io.*;
import circle.utils.Point;

public class Circle {
    private Point center;
    private double radius;
    private String label;
    private static final String defaultLabel = "unnamed";

    public Circle(Point center, double radius, String label) {
        this.center = new Point(center);
        this.radius = radius;
        if (label == null) {
            this.label = defaultLabel;
        } else
            this.label = label;
    }

    // public Circle(double x, double y, double radius, String label) {
    // Point centerPoint = new Point(x,y);
    // this.center = centerPoint;
    // this.radius = radius;
    // this.label = label;
    // }

    // delegation

    public Circle(double x, double y, double radius, String label) {
        this(new Point(x, y), radius, label);
    }

    public static Circle readFromFile(String fileName) {
        File input = new File(fileName);
        BufferedReader bf = null;
        Circle result = null;
        try {
            bf = new BufferedReader((new FileReader(input)));
            System.err.println("Successfully opened file : " + fileName);
            double x = Double.parseDouble(bf.readLine());
            double y = Double.parseDouble(bf.readLine());
            double radius = Double.parseDouble(bf.readLine());
            String label = bf.readLine();

            result = new Circle(x, y, radius, label);
            bf.close();
        } catch (IOException | NumberFormatException e) {
            result = new Circle(0, 0, 0, null);
        }
        return result;

    }

    public void saveToFile(String fileName){
        File output = new File(fileName);
        try{
        PrintWriter pw = new PrintWriter(output);
        pw.println(center.getX());
        pw.println(center.getY());
        pw.println(radius);
        pw.println(label);
        pw.close();
        System.err.println("Successfully written into file : " + fileName); 
        }
        catch(IOException e)
        {
            System.err.println("Error saving into file " + e.getMessage());
        }
    }

    public void enlarge(double f) {
        radius *= f;
    }

    public void shrink(double f) {
        if (f != 0) {
            radius /= f;
        } else if (f == 0) {
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return label + " : " + "(" + center.getX() + "," + center.getY() + ") r = " + radius;
    }

}