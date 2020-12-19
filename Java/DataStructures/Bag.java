import java.util.HashMap;

public class Bag<T> {
    private final HashMap<T, Integer> map = new HashMap<T, Integer>();

    public void add(T element) {
        int count = 1;

        Integer currentCount = map.get(element);
        if (currentCount != null) {

            count = currentCount + 1;
        }
        map.put(element, count);

    }

    public int countOf(T element) {
        Integer currentCount = map.get(element);
        if (currentCount != null) {
            return currentCount;
        } else
            return 0;
    }

    public void remove(T element) throws NotInBagException {
        Integer currentCount = map.get(element);
        if (currentCount == null) {
            throw new NotInBagException("Element: " + element + " Not in the bag");
        }
        if(currentCount==1)
        {
            map.remove(element);
        } 
        else
            map.put(element, currentCount-1);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
