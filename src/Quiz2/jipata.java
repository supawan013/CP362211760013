package Quiz2;

import org.omg.CORBA.portable.ValueOutputStream

import java.util.Scanner;

public class jipata {
    private static  void Continue () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue (Y/N): ");
        char c = sc.nextInt().charAt(0);
        if (c == 'Y' || c == 'y') showOption();
        else {
            System.out.println("Goog Bye.");
            System.exit(1); }
     }
    public static void main(String[] args) {
        showOption();
        }
    private static void showOption() {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            {


        System.out.println("####Welcome to Jipata System #### ");
        System.out.println("Please,select option below: ");
        Scanner in = new Scanner(System.in);
        System.out.println("1.Boby Mess Index (BMI.");
        System.out.println("2.Geometry capacity");
        System.out.println("2.1. Cricle.");
        System.out.println("3.Working with Array.");
        System.out.println("3.1 Working with Array.");
        System.out.print("Select : ");
        int selector = sc.nextInt();

        switch (Selector) {
            case 1:
        }





        System.out.print("Weight: ");
        float weight = in.nextFloat();

        System.out.print("Height: ");
        float height = in.nextFloat();

        float bmi = weight*10000.00f/(height*height);
        System.out.println(bmi);

        in.close();

        //Geometry capacity
        //2.1 Circle






}
