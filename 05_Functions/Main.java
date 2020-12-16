import java.util.Scanner;

public class Main {
    public static void announceDevTeaTime(){
        // Function's scope
        System.out.println("Waiting for developer tea time");
        System.out.println("Type in a random word and press " +
                "Enter to start a developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It is Devloper tea time!");
    }

    public static void main(String[] args){
        announceDevTeaTime();
    }
}