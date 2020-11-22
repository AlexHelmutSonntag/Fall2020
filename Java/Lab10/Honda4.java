//example of the abstract class and abstract method.
// Bike is an abstract class that contains only one abstract method run.
// It's implementation is provided by the Honda4 class
class Honda4 extends AbstraktBike {
    void run() {
        System.out.println("Run abstract from AbstraktBike and implemented in Honda4");
    }
    void walk()
    {
        System.out.println("Walking in style");
    }


}