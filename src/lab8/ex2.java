package lab8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        //input data to array
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter an integer[" + (i + 1) + "] : ");
            num[i] = sc.nextInt();
        }//for
        System.out.print("data in array");

        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }//find maximum
        int max = num[0];
        for (int i : num) {
            if (max < i)
                max = i;
        }
        System.out.println("The maximum number : " + max);
//find minimum
        int mini = num[0];
        for (int i: num) {
            if (mini >=i)
                mini = i;

        }
        System.out.println("The minimum number : " + mini);

        // find average
        int total = 0;
        for (int i:num){
            total += i;
        }
        System.out.println("The average number : " +(total/num.length));
    }
}