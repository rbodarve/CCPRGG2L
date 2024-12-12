//program to print the sum, product and average of three user input numbers

import java.util.Scanner;

public class SumAvePro {
    public static void main(String[] args) {
        //declaration of variables
        Scanner myObj = new Scanner(System.in);
        double x, y, z, sum, product, average;
        System.out.println("Program to print Sum, Average and Product of 3 User Input Numbers ");
            //catching the wrong input
            try{
                //assigning value of user input to three variables
                System.out.print("Enter three numbers: "); 
                x = myObj.nextInt();
                y = myObj.nextInt();
                z = myObj.nextInt();
                //math processes
                sum = x + y + z;
                product = x * y * z;
                average = sum / 3;
                //displaying the math results
                System.out.println("The sum is " + sum);
                System.out.println("The average is " + average);
                System.out.println("The product is " + product);
            }
            catch(Exception e){
                  System.out.println("Wrong Input");
            }
        myObj.close();
    }   
}
