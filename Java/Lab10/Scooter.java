class Scooter extends Bike {
    void move() {
        System.out.println("Just move");
    }

    void run() {
        System.out.println("Runnning like a scooter");
    }

    public static void main(String[] args) {
        Scooter s = new Scooter();
        s.move();
        s.run();
        s.walk();
        System.out.println(s.speed);
        Bike b = new Scooter();
        b.run();
        

        Bike b2 = new Bike();//upcasting
        b2.run();

    }

}