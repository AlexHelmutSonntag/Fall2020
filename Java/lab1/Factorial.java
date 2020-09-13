package Fall2020.Java.lab1;

public class Factorial {
    public static int fact(int n) {
        if (n == 1)
            return 1;

        else
            return n * fact(n - 1);
    }

    public static int fact2(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;

    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println(("Invalid number of command line arguments."));
            System.exit(0);
        } else {
            int N = Integer.parseInt(args[0]);
            if (N >= 0 && N <= 10) {
                System.out.println("The factorial of " + N + " with recursion equals " + fact(N));
                System.out.println("The factorial of " + N + " without recursion equals " + fact2(N));

            }
        }

    }
}