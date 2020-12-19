class JavaGeneric<T>
{
    // Object of type T is declared
    T obj;
    //Constructor
    JavaGeneric(T obj)
    {
        this.obj = obj;
    }
    // getObject method that returns our Generic type object
    public T getObject()
    {
        return this.obj;
    }
}
class MainGeneric
{
    public static void main(String[]args)
    {
        JavaGeneric<Integer> iObj1 = new JavaGeneric<Integer>(15);
        System.out.println(iObj1.getObject());
        JavaGeneric<String> iObj2 = new JavaGeneric<String>("GAYFORJAVA");
        System.out.println(iObj2.getObject());
    }
}
