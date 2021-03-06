import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("I need at least one argument, sir.");
        }
        String inputFile = args[0];
        System.out.print("Text to find: ");
        String textToFind = System.console().readLine();
        countAppearance(inputFile, textToFind);
    }

    private static void countAppearance(String inputFile, String textToFind) {
        File in = new File(inputFile);
        try (Scanner sc = new Scanner(in)) {
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(textToFind)) {
                    count++;
                }
            }
            System.out.println("'" + textToFind + "'" + "appeared in " + count + " Lines.");
        } catch (FileNotFoundException e) {
            System.err.println("The file cannot be opened.");
        }

    }

}