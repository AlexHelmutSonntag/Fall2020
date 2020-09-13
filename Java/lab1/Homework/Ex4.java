package Fall2020.Java.lab1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args)
    {
        System.out.print("Please enter the number you want to square: ");
        Scanner scanner = new Scanner(System.in);
        double S = scanner.nextDouble();
        System.out.print("Please enter your guess : ");
        double epsilon = scanner.nextDouble();
        double result1 = (epsilon + S/epsilon)/2;
        double result2 = (result1 + S/result1)/2;

        while( (result2 - result1) > epsilon)
        {
            result1 = result2;
            result2 = (result1 + S/result1)/2;
        }
        System.out.println("The Square is equal to " + result2);
        scanner.close();
        






    }
    
}