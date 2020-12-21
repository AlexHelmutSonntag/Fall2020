package zoo;

import zoo.Visitor;
import zoo.attraction.Attraction;
import zoo.attraction.ExclusiveAttraction;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Zoo {
    private String name;
    private int entranceFee;
    LinkedList<Attraction> attractions = new LinkedList<Attraction>();
    LinkedList<Visitor> visitors = new LinkedList<Visitor>();

    public Zoo(String name, int entranceFee) {
        if (name.length() <= 0 || entranceFee < 0) {
            throw new IllegalArgumentException("name can't be empty");
        } else {
            this.name = name;
            this.entranceFee = entranceFee;
        }
    }

    int getEntranceFee() {
        return entranceFee;
    }

    String getName() {
        return name;
    }

    public int nrOfAttractions() {
        if (attractions == null)
            return -1;
        else
            return attractions.size();
    }

    public void addAttraction(Attraction newAttraction) {
        if (newAttraction == null) {
            throw new IllegalArgumentException("Object is of value null");
        }
        int i = 0;
        while (i < attractions.size()) {
            if (newAttraction == attractions.get(i))
                break;
            else
                i++;
        }
        if (i == attractions.size())
            attractions.add(newAttraction);
    }
    LinkedList<Attraction> getAttractions() {
        return attractions;
    }

    void readFile() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfAttractions = Integer.parseInt(reader.readLine());
        int noOfVisitors = Integer.parseInt(reader.readLine());
        int entryFee = Integer.parseInt(reader.readLine());

        for (String line = reader.readLine();reader.readLine(); reader.readline()) {
            String[] parts = line.split(";");
            if (parts.length != 3) {
                continue;
            }
            if(parts[0]=="ATR")
            {
                if(Integer.parseInt(parts[2])==0)
                    {
                        Attraction temp = new Attraction(parts[1]);
                    }
                else  
                    {
                        ExclusiveAttraction temp = new ExclusiveAttraction(parts[1],Integer.parseInt(parts[2]));
                    }
            }
            if(parts[0]=="VIS")
            {
                Visitor temp = new Visitor(parts[1],Integer.parseInt(parts[2]));
            }
        }
    }

}