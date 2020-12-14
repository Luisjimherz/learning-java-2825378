/*
14.11.2020
Analyzing Reference types in Java (strings)
*/
public class Strings {
    public static void main(String[] args) {
        // DATATYPE variable_label = variable_value;
        String studentName = "Luis Fernando";
        String studentLastName = "Jimenez";
        int studetAge = 15;
        double studentGPA = 3.5;
        boolean perfectAttendance = true;

        System.out.println(studentName);
        System.out.println(studentLastName);
        System.out.println(studetAge);
        System.out.println(studentGPA);
        System.out.println(perfectAttendance);

        // Indixes with Strings
        System.out.println("Students intial is:");
        System.out.println(studentName.charAt(0));

        // Concatenating strings
        String fullName = studentName + " " + studentLastName;
        System.out.println("The student " + fullName + " has a GPA of " + studentGPA);
    }
}