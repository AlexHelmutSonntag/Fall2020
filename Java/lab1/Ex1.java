package Fall2020.Java.lab1;

public class Ex1 {
    public static void main(String[] args) {
        int Num = Integer.parseInt(args[0]);
        if (args.length != 1 || Num < 0) {
            System.err.println("ERROR: Invalid input. Please enter 1 positive number.");
            System.exit(1);
        } else {
            int sum = 0;
            for (int i = 1; i < Num; i++) {
                if (Num % i == 0) {
                    sum += i;
                }

            }
            if (sum == Num) {
                System.out.println(Num + " is a perfect number");
            } else {
                System.out.println(Num + " is not a perfect number");

            }

        }
    }
}
