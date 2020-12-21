import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class ExtendedStringIterator implements Iterator<Character>
{
    private String stringToIterate;
    private int counter;

    public ExtendedStringIterator(String stringToIterate)
    {
        this.stringToIterate = stringToIterate;
        this.counter = 0;
    }

    @Override
    public boolean hasNext()
    {
        return this.counter < this.stringToIterate.length();
    }

    @Override
    public Character next()
    {
        return this.stringToIterate.charAt(this.counter++);
    }

    @Override
    public void remove()
    {
        this.counter++;
    }
}

