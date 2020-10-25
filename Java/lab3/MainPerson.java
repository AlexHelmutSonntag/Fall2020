package main;

// import person.Person;
// import person.Gender;
import person.*;
// This means import all of the contents inside of the package person
public class MainPerson {
    public static void main(String[] args) {
        Person a = new Person("Smith", "Joe", "Doctor", Gender.MALE, 1954);
        Person b = new Person("Taylor", "Ann", "Hairdresser", Gender.FEMALE, 1964);
        System.out.println(a);
        System.out.println(b);
        if (b.equals(a)) {
            System.out.println("Same Person");
        } else {
            System.out.println("Not the same Person");

        }

    }

}