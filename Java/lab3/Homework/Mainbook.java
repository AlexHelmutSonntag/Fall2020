package library;

public class Mainbook {
    public static void main(String[] args) {
        Book a = new Book("Steppenwolf", "HermanHesse", 1927, 237, false);

        Book b = new Book("Momo", "MichaelEnde", 1973, 301, true);

        System.out.println(a);
        System.out.println(b);
        if (a.equals(b)) {
            System.out.println("They are the same book.");
        } else {
            System.out.println("They are not the same book.");
        }

        //Same as test
        if (a.sameAs(a)){
            System.out.println("They are the same book.");
        }
        else {
            System.out.println("They are not the same book.");
        }
        // toString test
        System.out.println(a.toString());

        // NULL test
        Book empty = new Book("", "", 1973, 301, true);
        System.out.println(empty);

    }
}