package zoo;
import zoo.Zoo;
import zoo.attraction.Attraction;
import zoo.attraction.ExclusiveAttraction;
public class Visitor {
    private String name;
    private int money;
    private Zoo zoo;

    public Visitor(String name, int money, Zoo zoo) {
        if (money < 0 || name == null || zoo == null) {
            throw new IllegalArgumentException("Value of money can't be -ve and the zoo can't be null");
        } else {
            this.money = money;
            this.name = name;
            this.zoo = zoo;
        }
    }

    public Visitor(String name, int money) {
        if (money < 0 || name == null||name.trim().equals("")) {
            throw new IllegalArgumentException("Value of money can't be -ve");
        } else {
            this.money = money;
            this.name = name;
            this.zoo = zoo;
        }
    }

    String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public boolean pay(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        if (this.money < price)
            return false;
        else {
            this.money -= price;
            return true;
        }
    }

    public boolean enterZoo(Zoo zoo) {
        if (zoo == null) {
            throw new IllegalArgumentException("This Zoo doesn't exist");
        }
        if (this.zoo != null) {
            throw new IllegalStateException("You can't enter another zoo because you are one");
        }
        if (this.zoo == null) {
            if (this.money >= zoo.getEntranceFee()) {
                this.money -= zoo.getEntranceFee();
                this.zoo = zoo;
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }

    public void exitZoo() {
        if (this.zoo == null) {
            throw new IllegalArgumentException("You are not in a zoo yet");
        } else
            this.zoo = null;
    }

}