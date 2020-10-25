public class Calculator {
    public static void main(String[]args)
{
    if (args.length!=3)
    {
        throw new IllegalArgumentException();
    }
    else{
        double a =Double.parseDouble(args[0]);
        char m =args[1].charAt(0);
        double b  =Double.parseDouble(args[2]);
        System.out.print(""+a+m+b+"=");
        switch(m)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);import java.io.*;

            class ParityDetection {
                public static String outputText(int number, String type) {
                    return String.valueOf(number) + " is an " + type + " number\n";
                }
            
                public static void main(String[] args) {
                    final String name = "./nums.txt";
                    final String output = "./out.txt";
                    try (BufferedReader br = new BufferedReader(new FileReader(name))){
                        String text = "";
                        String line;
                        while ( null != (line = br.readLine()) ) {
                           try {
                              int num = Integer.parseInt(line);
                              text += (num  % 2 == 0) ? outputText(num, "even") : outputText(num, "odd");
                           } catch (NumberFormatException e) {
                              System.out.println("Warning: Can't parse to integer line: \n" + line);
                           }
                        }
                        try (BufferedWriter out = new BufferedWriter(new FileWriter(output))) {
                          out.write(text);
                          out.close();
                        } catch (IOException e) {
                          System.out.println("No such file to write in: " + output);
                          System.out.println(e.getMessage());
                        } 
                        //System.out.println(text);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } 
                }
            }import java.io.*;

            class ParityDetection {
                public static String outputText(int number, String type) {
                    return String.valueOf(number) + " is an " + type + " number\n";
                }
            
                public static void main(String[] args) {
                    final String name = "./nums.txt";
                    final String output = "./out.txt";
                    try (BufferedReader br = new BufferedReader(new FileReader(name))){
                        String text = "";
                        String line;
                        while ( null != (line = br.readLine()) ) {
                           try {
                              int num = Integer.parseInt(line);
                              text += (num  % 2 == 0) ? outputText(num, "even") : outputText(num, "odd");
                           } catch (NumberFormatException e) {
                              System.out.println("Warning: Can't parse to integer line: \n" + line);
                           }
                        }
                        try (BufferedWriter out = new BufferedWriter(new FileWriter(output))) {
                          out.write(text);
                          out.close();
                        } catch (IOException e) {
                          System.out.println("No such file to write in: " + output);
                          System.out.println(e.getMessage());
                        } 
                        //System.out.println(text);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } 
                }
            }
            break;
            case '%':
            System.out.println(a%b);
            break;
            case '/':
            if(b==0)
            {
                throw new ArithmeticException("Can't divide by 0");
            }
            System.out.println(a/b);
            break;
            default :
            throw new IllegalArgumentException();
        }
    }   
    }
}