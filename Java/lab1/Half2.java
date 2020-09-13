package Fall2020.Java.lab1;

import java.util.Scanner;

public class Half2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from, to;
        System.out.print("Please enter lower limit : ");
        from = scanner.nextInt();
        System.out.print("Please enter upper limit : ");
        to = scanner.nextInt();
        for (int idx = from; idx < to; idx++) {

            System.out.println("The half of this number will be : " + idx / 2.0);
        }

        scanner.close();

    }

}