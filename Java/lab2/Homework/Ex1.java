import java.util.Scanner;

public class Ex1 {
    static void conjugate(String s)
    {
        String temp = s;
        // int len = temp.length();
        String result;
        if (temp.indexOf('+')!=-1)
        {
            result = temp.replace('+','-'); 
        }
        else
        {
            result = temp.replace('-','+');

        }
        
        System.out.print("Input = " + s);
        System.out.println(" and it's Conjugate = " + result);
    }
    public static void main(String []args )
    {
        System.out.print("Please input a complex number(Without space) : ");   
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        conjugate(string);
        scanner.close();

    }
    
}