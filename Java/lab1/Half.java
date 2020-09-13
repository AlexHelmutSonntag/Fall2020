package Fall2020.Java.lab1;

// import java.util.Scanner;

public class Half {
        public static void main(String [] args)
        {
            int from, to;
            from = Integer.parseInt(System.console().readLine("Please enter the lower limit "));
            to = Integer.parseInt(System.console().readLine("Please enter the upper limit "));
            System.out.print( from + " to " + to + " will be equal to : \n");
            for (int idx = from; idx <= to; ++idx)
            {
                System.out.print("The half of " + idx + " is " + idx/2.0 + "\n");
            }




        }
}