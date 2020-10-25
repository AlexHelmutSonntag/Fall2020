import stringutils.IterLetter;

public class MainTask6 {
    public static void main(String[] args) {
        IterLetter it = new IterLetter("hello");
        it.printNext();
        it.printNext();
        it.restart();
        while (it.hasNext()) {
            it.printNext();
        }
    }

}