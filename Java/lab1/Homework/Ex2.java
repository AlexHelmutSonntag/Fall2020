package Fall2020.Java.lab1;

public class Ex2 {
    public static void main(String[] args) {
        int Num = Integer.parseInt(args[0]);
        if (args.length != 1 || Num < 0) {
            System.err.println("ERROR: Invalid input. Please enter 1 positive number.");
            System.exit(1);
        } else {
            int count = 0;
            int i, j;
            for (i = Num; i > 0; i--) {
                int sum = 0;
                for (j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;

                    }
                }
                if (sum == i) {
                    count++;
                }
            }
            System.out.println("The count of Perfect numbers from 1 to " + Num + " is : " + count);
        }
    }
}