import java.io.PrintWriter;

public class MainBuffer {
    public static void main(String[]args)
    {
        if(args.length<2)
            System.err.println("Not enough command line arguments. Min 2 required.");
    
    String inputFile = args[0];
    String outputFile = args[1];

    summarize(inputFile , outputFile);
}
private static void summarize(String inputFile, String outputFile)
    {
    File in = new File(inputFile);
    File out = new File(outputFile);
    
    try (BufferedReader br = new BufferedReader(new FileReader(in));
        PrintWriter pw = new PrintWriter(out))
        {
            /*It is used to retrieve the PrintWriter object associated with the console. The Java PrintWriter class (java.io.PrintWriter) enables you to write formatted data to an underlying Writer. For instance, writing int,long and other primitive data formatted as text, rather than as their byte values.The Java PrintWriter is useful if you are generating reports (or similar) where you have to mix text and Numbers;
            */
        String line;
            while(null!=(line = br.readline()))
            {
                String[]parts = line.split(",");
                int sum = 0;
                for(String number :parts){
                    int i = Integer.parseInt(number);
                    sum+=i;
                }
                pw.println(sum);
            }
        }
            catch (IOException e)
            {
                System.err.println("An IO error occured");
            }

    }
}
