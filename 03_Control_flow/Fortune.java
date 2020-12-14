/*
12.14.2020
This program use if statements to control the flow of the code
*/
import java.util.Scanner;
public class Fortune{
    public static void main(String[] args){
        /*If statement (Boolean expressions)
        Evaluates to a boolean. The decision block will be
        either excuted or not depending on the result.
        <, >, ==, <=, >=, and !=
        */
        System.out.println("Pick a number between 1 and 10");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 5) {
            System.out.println("Good luck!");
        } else {
            System.out.println("Bad luck!");
        }
    }
}