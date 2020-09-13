package Fall2020.Java.lab1;

import java.util.Scanner;

class Class1 {
    public static void main(String[] args) {
        // This means we need to pass an argument when compiling the program 
        // So, when saying java Class1.java (We need to pass an argument here)
        if (args.length ==0)
        {
            System.err.println("Invalid number of Arguments! ");
            System.exit(1);
        }
        else{
            System.out.println("Hello " + args[0] +"!");
        }
        // We could pass more than one 
        System.out.println("######\ntrying something ");

        System.out.println(args[0] +" " +args[1]+ " is a student");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // String name = System.console().readLine();
        System.out.println("Hello " + name);
        scanner.close();

        System.out.println("######\nTask 5");
       
        
    }
}