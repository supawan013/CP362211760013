package lab7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score, " + "and i will tell you grade:");

        int score = sc.nextInt();

        if (score > 80)
            System.out.println("Grade A.");
        else if (score > 75)
            System.out.println("Grade B.");
        else if (score > 70)
            System.out.println("Grade B+.");
        else if (score > 65)
            System.out.println("Grade C.");
        else if (score > 60)
            System.out.println("Grade C+.");
        else if (score > 55)
            System.out.println("Grade D.");
        else if (score > 50)
            System.out.println("Grade D+.");
        else
            System.out.println("Grade F.");

    }
}









