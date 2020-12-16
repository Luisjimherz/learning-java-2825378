/*
12.16.2020
Calculate the salary based on per-hour salary
and the total hours the employee works every week
Output: Employee's gross yearly salary
Bonus: Discount vacation days
*/
import java.util.Scanner;

public class Salary{
    public static double totalSalary(double hourFee, // salary per hour
                                     double daysWeek, // days worked at a week
                                     double vacationsYear){ //vacations days at a year
        if (hourFee < 0){
            return -1;
        }
        if(daysWeek < 0){
            return -1;
        }
        double salaryYear = (hourFee * 8) * (daysWeek * 52 - vacationsYear);
        return salaryYear;
    }

    public static void main(String[] args){
        double test;
        double testFee;
        double testDays;
        double testVac;

        System.out.println("What is the employee's salary per hour");
        Scanner scan = new Scanner(System.in);
        testFee = scan.nextDouble();
        System.out.println("How many days a week does the employee work?");
        scan = new Scanner(System.in);
        testDays = scan.nextDouble();
        System.out.println("How mani vacations' days did the employee took in the year?");
        scan = new Scanner(System.in);
        testVac = scan.nextDouble();

        test = totalSalary(testFee, testDays, testVac);
        System.out.println(test);
    }
}
