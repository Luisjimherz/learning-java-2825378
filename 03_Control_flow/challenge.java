/*
12.14.2020
Implemennt a Multiple-Choice Question
1.- Print a creative question with three answer
    choices being just one correct
2.- Ask the use for his/her answer
3.- Print out an appropiate mesaage to the user
    deppending on id he/she is rigth
*/
import java.util.Scanner;

public class challenge{
    public static void main(String[] args) {
        String question = "what is the name of my pet?";
        String a = "dolly";
        String b = "kiara";
        String c = "nopal";

        System.out.println(question);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your ansewr is: " + answer);

        if (b.equals(answer.toLowerCase())) {
            System.out.println("Congrats! You are right");
        } else {
            System.out.println("Sorry, you failed");
        }
    }
}