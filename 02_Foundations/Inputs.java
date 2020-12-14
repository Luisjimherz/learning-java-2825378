/*
12.14.2020
Inputing information into a program
*/
import java.util.Scanner;
public class Inputs{
    public static void main(String[] arg) {
        double GPA = 3.5;
        String firstName = "Luis Fernando";
        String lastName = "Jimenez";
        System.out.println(firstName + " " + lastName +
                " has a GPA of " + GPA);
        System.out.println("What do you want to update it to?");

        // Retrieving data from the user
        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();

        System.out.println(firstName + " " + lastName +
                " now has a GPA of " + GPA);
    }
}