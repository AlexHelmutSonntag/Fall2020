class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }
    public void draw()
    {
        System.out.println("Drawing");
    }
    public static void main(String[]args)
    {
        A6 obj = new A6();
        obj.print();
        System.out.println(Printable.glas);/*Because glas is a field of Printable and all of the fields in an interface are static public and final*/
    }

}