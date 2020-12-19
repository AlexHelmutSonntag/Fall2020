package weightlifting;

import java.io.*;
import java.util.*;

// You could also do
/*
 * File filename = new File(filePath); FileReader filereader = new
 * FileReader(filename); BufferedReader reader = new BufferedReader(filereader);
 * 
 */
class Championship {
    private LinkedList<WeightLifter> weightLifters;

    public Championship(String filePath) {
        weightLifters = new LinkedList<WeightLifter>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] parts = line.split(":");
                if (parts.length != 2)
                    continue;

                try {
                    WeightLifter weightLifter = WeightLifter.make(parts[0], Integer.parseInt(parts[1]));
                    if (weightLifter != null)
                        weightLifters.add(weightLifter);

                } catch (NumberFormatException e) {
                    System.out.println("Weight inserted is not in integer format");
                }
            }

        } catch (IOException e) {
            System.out.println("There's sth wrong with filePath passed as an argument");

        }
    }

    public int numberOfWeightLifters() {
        return weightLifters.size();
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < weightLifters.size() - 1; ++i) {

            sb.append(weightLifters.get(i).show() + "\n");
        }
        if (weightLifters.size() > 0)
            sb.append(weightLifters.get(weightLifters.size() - 1).show());

        return sb.toString();
    }

}
