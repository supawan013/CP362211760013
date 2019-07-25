package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Please, enter an integer : ");
        int x = scanner.nextInt();

        System.out.println("your entered integer: "+x);

        //input double
        System.out.print("Please, enter an integer2:");
        double b = scanner.nextDouble();

        System.out.println("Your entered integer2: "+b);

        //input string
        System.out.print("Please enter you name: ");
        String s = scanner.nextLine();

        System.out.println("You name is: "+s);
    }
}
