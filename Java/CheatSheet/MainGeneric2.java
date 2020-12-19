class JavaGen<T, U>
{
    T obj1;
    U obj2;

    //Constructor
    JavaGen(T obj1,U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    @Override
    public String toString()
    {
        return obj2+" : "+obj1;
    }
}
class MainGeneric2{
    public static void main(String[]args)
    {
        JavaGen<Integer,String> obj1 = new JavaGen<Integer,String>(1999,"Ali");
        obj1.print();
        System.out.println(obj1);
    }
}
