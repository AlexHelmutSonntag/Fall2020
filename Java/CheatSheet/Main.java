import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String[] args)
    {
        ExtendedString temp1 = new ExtendedString("Java programming");
        ExtendedString temp2 = new ExtendedString("C++ programming");

        System.out.println("temp1.compareTo(temp2): " + temp1.compareTo(temp2));
        System.out.println("temp2.compareTo(temp1): " + temp2.compareTo(temp1));

        Iterator<Character> it = temp1.iterator();

        while (it.hasNext())
        {
            char ch = it.next();
            System.out.println("ch: " + ch);
        }

        System.out.println("-------------------------------------------------------");

        it = temp1.iterator();
        if (it.hasNext())
        {
            it.remove();
        }

        while (it.hasNext())
        {
            char ch = it.next();
            System.out.println("ch: " + ch);
        }

        ArrayList<ExtendedString> list = new ArrayList<ExtendedString>();
        list.add(new ExtendedString("This is a full sentence."));
        list.add(temp1);
        list.add(temp2);
        list.add(new ExtendedString("world"));
        list.add(new ExtendedString("hello"));
        list.add(new ExtendedString("java"));
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
