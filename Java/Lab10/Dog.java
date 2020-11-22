class Animal{}
class Dog extends Animal{
    public static void main(String[]args)
    {
        Dog d = new Dog();
        System.out.println(d instanceof Animal);// true instanceof gives out a boolean value whether the object is an instance of what's mentioned afterwards.
        Dog b = null;
        System.out.println(b instanceof Animal);//false because b points to null 

    }
}