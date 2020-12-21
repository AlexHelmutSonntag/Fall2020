package zoo.attraction;

import java.util.LinkedList;
import zoo.Visitor;
import zoo.Zoo;
public class Attraction {
    private String name;

    

    public Attraction(String name) {
        if (name.length() == 0 || name == null||name.trim().equals(""))
            throw new IllegalArgumentException("name is either empty or equal to null");
        else
            this.name = name;
    }

    public String getName() {
        return name;
    }

    
    

    boolean visit(Visitor visitor) {

        return true;
    }

    @Override
    public String toString() {
        return "Attraction " + name;
    }

}