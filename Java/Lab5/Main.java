// import java.io.BufferedReader;
// import java.io.PrintWriter;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Wrong no. of arguments. Please pass two files.");
        }
        String inputFile = args[0];
        String outputFile = args[1];
        summarize(inputFile, outputFile);
    }

    private static void summarize(String inputFile, String outputFile) {
        File in = new File(inputFile);
        File out = new File(outputFile);
        

        try (BufferedReader buffer_reader = new BufferedReader(new FileReader(in));
                PrintWriter print_writer = new PrintWriter(out)) {
            String line;
            int row_count = 0;
            while (null != (line = buffer_reader.readLine())) {
                String[] database = line.split(",");
                row_count++;
                int sum = 0;
                for (String num : database) {
                    int i = Integer.parseInt(num);
                    sum += i;
                }
                print_writer.println("the sum of the row no. "+ row_count+ "= " + sum);
            }
        } catch (IOException e) {
            System.err.println("An IO error occured.");
        }

    }
}
    