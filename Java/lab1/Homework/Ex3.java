package Fall2020.Java.lab1;

public class Ex3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Invalid input.");
            System.exit(0);
        } else {
            long min = Long.parseLong(args[0]);
            for (int j = 1; j < args.length; j++) {
                if (Long.parseLong(args[j]) < min) {
                    min = Long.parseLong(args[j]);
                }

            }
            int max_divisor = 0;

            for (int i = 0; i < args.length; i++) {
                int current = Integer.parseInt(args[i]);
                for (int indx = 1; indx <= min; indx++) {
                    if (current % indx == 0 && min % indx == 0) {
                        max_divisor = indx;
                    }
                }

            }
            System.out.println("The max divisor is " + max_divisor);
        }
    }

}