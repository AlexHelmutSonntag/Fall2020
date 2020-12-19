package weightlifting;

public class WeightLifter {
    private String name;
    private int weight;

    private static WeightLifter strongestWeightLifter;

    private WeightLifter(String name, int weight) {
        this.name = name;
        this.weight = weight;

        if (strongestWeightLifter == null || weight > strongestWeightLifter.weight) {
            strongestWeightLifter = this;
        }

    }
 

    public static WeightLifter make(String name, int weight) {
        if (weight < 0 || weight > 300 || name.length() < 2)
            return null;

        int i = 0;

        while (i < name.length()) {
            if (name.charAt(i) != ' ' && !Character.isLetter(name.charAt(i)))
                return null;
            ++i;
        }

        return new WeightLifter(name, weight);
    }

    public int getWeight() {
        return weight;
    }

    public boolean strongerThan(WeightLifter other) {
        return this.weight > other.weight;
    }

    public String show() {
        return String.format("%s - %d kg", name, weight);
    }

    public static WeightLifter getStrongestWeightLifter() {
        return strongestWeightLifter;
    }

}
