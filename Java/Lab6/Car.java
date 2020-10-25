package car;
import car.utils.Color;

public class Car {
    
    Color color;
    String license_Plate;
    int maximal_Speed;
    public static int creations_counter = 0;

    public Car(String license_Plate,Color color, int maximal_Speed)
    {
        this.license_Plate = license_Plate;
        this.maximal_Speed = maximal_Speed;
        this.color = color;
        creations_counter++;
    }
    public static boolean isFaster(Car car1, Car car2)
    {
        return (car1.maximal_Speed>car2.maximal_Speed);
    }
    public Car()
    {   
        this.license_Plate = "AAA-000";
        this.color = Color.BLUE;
        this.maximal_Speed =120;
        creations_counter++;
    } 
    
}