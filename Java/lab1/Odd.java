package Fall2020.Java.lab1;

public class Odd {
    public static void main( String [] args)
    {
        if(args.length!=1)
        {
            System.err.println("Give exactly one integer number as an argument!");
        }
        else
        {
            int num = Integer.parseInt(args[0]);
            String answer = (num %2 ==1)? "odd" : "even";
            System.out.println(answer);
        }
    }
}