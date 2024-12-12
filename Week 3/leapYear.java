import java.util.Scanner;

public class leapYear {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int year;
        System.out.println("Program to check if given year is leap year.");
        System.out.print("Enter year to check: ");
        year = myObj.nextInt();
        if(year%400==0 || year%4==0&year%100!=0)
            System.out.println("Year " + year + " is a leap year.");
        else
            System.out.println("Year " + year + " is not a leap year.");
    }
}
