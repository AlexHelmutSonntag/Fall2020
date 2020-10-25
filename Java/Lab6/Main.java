import java.io.*;
import java.util.*;
import car.Car;
import car.utils.Color;


public class Main {
    public static void main(String[]args) throws FileNotFoundException
    {
        ArrayList<Car> cars_Array = new ArrayList<Car>(3);
        String input_file = "input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(input_file)))
        {
            String line = "";
            String[] parsedline;
            int i =0;
            while((line = bufferedReader.readLine())!=null)
            {
                parsedline = line.split(",");
                cars_Array.add(new Car(parsedline[0].trim(),Color.valueOf(parsedline[1].trim()),Integer.valueOf(parsedline[2].trim())));
            }
            boolean isFaster = Car.isFaster(cars_Array.get(0),cars_Array.get(1));
            System.out.println(isFaster);
            System.out.println(Car.creations_counter);

        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}