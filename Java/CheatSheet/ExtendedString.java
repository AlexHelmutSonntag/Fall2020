import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class ExtendedString implements Comparable<ExtendedString>, Iterable<Character>
{
    private String data;

    public ExtendedString(String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return this.data;
    }

    @Override
    public int compareTo(ExtendedString other)
    {
        return this.data.length() - other.data.length();
    }

    @Override
    public Iterator<Character> iterator()
    {
        return new ExtendedStringIterator(this.data);
    }
}

