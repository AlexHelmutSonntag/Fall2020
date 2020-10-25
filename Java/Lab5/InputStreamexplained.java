import java.io.*;
public class InputStreamexplained {
    public static void main(String[]args)throws Exception
    {
        InputStreamReader streamreader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamreader);
        System.out.println("Enter your name");
        // String name  = bufferedReader.readLine();
        System.out.println("Welcome " + bufferedReader.readLine());
    }
}