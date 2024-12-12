import java.util.Scanner;

class variable{
    double x, y, z;
}

class compute{
    double sum, prod, ave, diff;
    compute(double x, double y, double z){
        this.sum = x + y + z;
        this.prod = x * y * z;
        this.ave = sum / 3;
        this.diff = x - y - z;
    }
}

public class oopSumAveProdSub {
    public static void display(double x, double y, double z, double m){
        System.out.printf("The sum is %.3f %n", x);
        System.out.printf("The average is %.3f %n", y);
        System.out.printf("The product is %.3f %n", z);
        System.out.printf("The cumulative difference is %.3f %n", m);
    }
    
    public static void title(){
        System.out.println("Three Number Computations");
        System.out.println("Program to compute Sum, Cumulative Difference, "
                + "Product and Average of 3 numbers"
                + " up to 3 decimal places.");
    }
        
    public static void readInput(){
        Scanner myObj = new Scanner(System.in);
        variable a = new variable();
        System.out.print("Enter first number: ");
        a.x = myObj.nextDouble();
        System.out.print("Enter second number: ");
        a.y = myObj.nextDouble();
        System.out.print("Enter third number: ");                
        a.z = myObj.nextDouble();
        compute b = new compute(a.x,a.y,a.z);
        //display answers
        display(b.sum,b.ave,b.prod, b.diff);
        myObj.close();
    }
    
    public static void main(String[] args) {
        title();
        try{
            readInput();
        }catch(Exception e){
            System.out.println("Wrong Input");
        }
    }
}
