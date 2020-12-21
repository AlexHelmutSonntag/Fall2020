package zoo.attraction;

import zoo.Visitor;
import zoo.Zoo;

public class ExclusiveAttraction extends Attraction {
    private int price;

    public ExclusiveAttraction(String name, int price) {
        super(name);
        if (name == null || price < 0 || name.trim().equals("")) {
            throw new IllegalArgumentException("Can't have that like that");
        } else {
            this.price = price;
        }
    }

    int getPrice() {
        return price;
    }

    @Override
    boolean visit(Visitor visitor) {

        if (visitor.getMoney() >= this.price) {
            visitor.pay(this.price);
            return true;
        } else
            return false;
    }

}