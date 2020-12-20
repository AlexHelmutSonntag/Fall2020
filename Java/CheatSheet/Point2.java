import java.util.ArrayList;
import java.util.Collections;

public class Point2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zanything");
        list.add("nanything");
        list.add("banything1");

        System.out.println(list); // [zanything, nanything, banything1]
        // This sorts the list in an alphabetical order
        Collections.sort(list); // [banything1, nanything, zanything]

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(5);
        list2.add(2);
        list2.add(6);
        list2.add(4);
        System.out.println(list2); // [5, 2, 6, 4]
        // This sorts the list inn ascending order
        Collections.sort(list2);
        System.out.println(list2);// [2, 4, 5, 6]

        Collections.reverse(list2);

        System.out.println(list2); // [6, 5, 4, 2]
    }
}
