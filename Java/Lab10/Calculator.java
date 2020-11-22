/*Example of Compile-time polymorphism;
 overloading Calculator*/
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

}