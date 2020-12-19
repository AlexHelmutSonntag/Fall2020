import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.EOFException;
import java.io.*;

public class MainBag {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("foo");
        bag.add("foo");
        bag.add("foo2");
        bag.add("foo3");
        bag.add("foo");
        bag.add("afk");
        bag.add("idk");
        System.out.println("Word Statistics: " + bag);

        System.out.println(bag.countOf("foo"));
        System.out.println(bag.countOf("afk"));

        System.out.println(bag.countOf("foo"));

        File input = new File(args[0]);
        Bag<String> statistics = new Bag<>();

        try (Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                statistics.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read the file" + args[0]);
        }
        System.out.println("Word statistics of the input file : " + statistics);

    }
    

}
